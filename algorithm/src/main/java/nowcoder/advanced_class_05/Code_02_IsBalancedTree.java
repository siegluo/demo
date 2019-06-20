package nowcoder.advanced_class_05;

public class Code_02_IsBalancedTree {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}

	public static boolean isBalance(Node head) {
		boolean[] res = new boolean[1];
		res[0] = true;
		getHeight(head, 1, res);
		return res[0];
	}
	
	public static class ReturnType {
		public int level;
		public boolean isB;
		
		public ReturnType(int l, boolean is) {
			level = l;
			isB = is;
		}
	}
	
	// process(head, 1)
	
	public static ReturnType process(Node head, int level) {
		if (head == null) {
			return new ReturnType(level, true);
		}
		ReturnType leftSubTreeInfo = process(head.left, level + 1);
		if(!leftSubTreeInfo.isB) {
			return new ReturnType(level, false);
		}
		ReturnType rightSubTreeInfo = process(head.right, level + 1);
		if(!rightSubTreeInfo.isB) {
			return new ReturnType(level, false);
		}
		if (Math.abs(rightSubTreeInfo.level - leftSubTreeInfo.level) > 1) {
			return new ReturnType(level, false);
		}
		return new ReturnType(Math.max(leftSubTreeInfo.level, rightSubTreeInfo.level), true);
	}

	public static int getHeight(Node head, int level, boolean[] res) {
		if (head == null) {
			return level;
		}
		int lH = getHeight(head.left, level + 1, res);
		if (!res[0]) {
			return level;
		}
		int rH = getHeight(head.right, level + 1, res);
		if (!res[0]) {
			return level;
		}
		if (Math.abs(lH - rH) > 1) {
			res[0] = false;
		}
		return Math.max(lH, rH);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.left = new Node(6);
		head.right.right = new Node(7);

		System.out.println(isBalance(head));

	}

}
