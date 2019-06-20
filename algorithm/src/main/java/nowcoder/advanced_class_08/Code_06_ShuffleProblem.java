package nowcoder.advanced_class_08;

import java.util.Arrays;

public class Code_06_ShuffleProblem {

	// https://arxiv.org/pdf/0805.1598.pdf
	public static void shuffle(int[] arr) {
		if (arr != null && arr.length != 0 && (arr.length & 1) == 0) {
			shuffle(arr, 0, arr.length - 1);
		}
	}

	public static void shuffle(int[] arr, int l, int r) {
		while (r - l + 1 > 0) {
			int lenAndOne = r - l + 2;
			int bloom = 3;
			int k = 1;
			while (bloom <= lenAndOne / 3) {
				bloom *= 3;
				k++;
			}
			int m = (bloom - 1) / 2;
			int mid = (l + r) / 2;
			rotate(arr, l + m, mid, mid + m);
			cycles(arr, l - 1, bloom, k);
			l = l + bloom - 1;
		}
	}

	public static void cycles(int[] arr, int base, int bloom, int k) {
		for (int i = 0, trigger = 1; i < k; i++, trigger *= 3) {
			int next = (2 * trigger) % bloom;
			int cur = next;
			int record = arr[next + base];
			int tmp = 0;
			arr[next + base] = arr[trigger + base];
			while (cur != trigger) {
				next = (2 * cur) % bloom;
				tmp = arr[next + base];
				arr[next + base] = record;
				cur = next;
				record = tmp;
			}
		}
	}

	public static void rotate(int[] arr, int l, int m, int r) {
		reverse(arr, l, m);
		reverse(arr, m + 1, r);
		reverse(arr, l, r);
	}

	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int tmp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = tmp;
		}
	}

	// for test
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// for test
	public static int[] generateArray() {
		int len = (int) (Math.random() * 10) * 2;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

	// for test
	public static void shuffleTest(int[] arr) {
		int[] tarr = new int[arr.length];
		int bloom = arr.length + 1;
		for (int i = 1; i <= arr.length; i++) {
			tarr[((2 * i) % bloom) - 1] = arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = tarr[i];
		}
	}

	public static boolean equalArrays(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5000000; i++) {
			int[] arr = generateArray();
			int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length);
			int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);
			shuffle(arr1);
			shuffleTest(arr2);
			if (!equalArrays(arr1, arr2)) {
				System.out.println("ooops!");
				printArray(arr);
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}

	}

}
