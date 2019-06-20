package nowcoder.advanced_class_08;

import java.util.Arrays;
import java.util.HashSet;

public class Code_01_TopKSumCrossTwoArrays {

	public static class HeapNode {
		public int row;
		public int col;
		public int value;

		public HeapNode(int row, int col, int value) {
			this.row = row;
			this.col = col;
			this.value = value;
		}
	}

	public static int[] topKSum(int[] a1, int[] a2, int topK) {
		if (a1 == null || a2 == null || topK < 1) {
			return null;
		}
		topK = Math.min(topK, a1.length * a2.length);
		HeapNode[] heap = new HeapNode[topK + 1];
		int heapSize = 0;
		int headR = a1.length - 1;
		int headC = a2.length - 1;
		int uR = -1;
		int uC = -1;
		int lR = -1;
		int lC = -1;
		heapInsert(heap, heapSize++, headR, headC, a1[headR] + a2[headC]);
		HashSet<String> positionSet = new HashSet<String>();
		int[] res = new int[topK];
		int resIndex = 0;
		while (resIndex != topK) {
			HeapNode head = popHead(heap, heapSize--);
			res[resIndex++] = head.value;
			headR = head.row;
			headC = head.col;
			uR = headR - 1;
			uC = headC;
			if (headR != 0 && !isContains(uR, uC, positionSet)) {
				heapInsert(heap, heapSize++, uR, uC, a1[uR] + a2[uC]);
				addPositionToSet(uR, uC, positionSet);
			}
			lR = headR;
			lC = headC - 1;
			if (headC != 0 && !isContains(lR, lC, positionSet)) {
				heapInsert(heap, heapSize++, lR, lC, a1[lR] + a2[lC]);
				addPositionToSet(lR, lC, positionSet);
			}
		}
		return res;
	}

	public static HeapNode popHead(HeapNode[] heap, int heapSize) {
		HeapNode res = heap[0];
		swap(heap, 0, heapSize - 1);
		heap[--heapSize] = null;
		heapify(heap, 0, heapSize);
		return res;
	}

	public static void heapify(HeapNode[] heap, int index, int heapSize) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		while (left < heapSize) {
			if (heap[left].value > heap[index].value) {
				largest = left;
			}
			if (right < heapSize && heap[right].value > heap[largest].value) {
				largest = right;
			}
			if (largest != index) {
				swap(heap, largest, index);
			} else {
				break;
			}
			index = largest;
			left = index * 2 + 1;
			right = index * 2 + 2;
		}
	}

	public static void heapInsert(HeapNode[] heap, int index, int row, int col,
			int value) {
		heap[index] = new HeapNode(row, col, value);
		int parent = (index - 1) / 2;
		while (index != 0) {
			if (heap[index].value > heap[parent].value) {
				swap(heap, parent, index);
				index = parent;
				parent = (index - 1) / 2;
			} else {
				break;
			}
		}
	}

	public static void swap(HeapNode[] heap, int index1, int index2) {
		HeapNode tmp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = tmp;
	}

	public static boolean isContains(int row, int col, HashSet<String> set) {
		return set.contains(String.valueOf(row + "_" + col));
	}

	public static void addPositionToSet(int row, int col, HashSet<String> set) {
		set.add(String.valueOf(row + "_" + col));
	}

	// For test, this method is inefficient but absolutely right
	public static int[] topKSumTest(int[] arr1, int[] arr2, int topK) {
		int[] all = new int[arr1.length * arr2.length];
		int index = 0;
		for (int i = 0; i != arr1.length; i++) {
			for (int j = 0; j != arr2.length; j++) {
				all[index++] = arr1[i] + arr2[j];
			}
		}
		Arrays.sort(all);
		int[] res = new int[Math.min(topK, all.length)];
		index = all.length - 1;
		for (int i = 0; i != res.length; i++) {
			res[i] = all[index--];
		}
		return res;
	}

	public static int[] generateRandomSortArray(int len) {
		int[] res = new int[len];
		for (int i = 0; i != res.length; i++) {
			res[i] = (int) (Math.random() * 50000) + 1;
		}
		Arrays.sort(res);
		return res;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static boolean isEqual(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i != arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a1Len = 5000;
		int a2Len = 4000;
		int k = 2000;
		int[] arr1 = generateRandomSortArray(a1Len);
		int[] arr2 = generateRandomSortArray(a2Len);
		long start = System.currentTimeMillis();
		int[] res = topKSum(arr1, arr2, k);
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms");

		start = System.currentTimeMillis();
		int[] absolutelyRight = topKSumTest(arr1, arr2, k);
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");

		System.out.println(isEqual(res, absolutelyRight));

	}

}
