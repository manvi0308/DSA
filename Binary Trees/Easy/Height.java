package binary.tree;

import java.util.ArrayList;

public class Height {
	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	Height() {
		root = null;
	}

	Height(int key) {
		root = new Node(key);
	}

	static ArrayList<Integer> inOrder(Node root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		inOrderUtil(res, root);
		return res;
	}

	static void inOrderUtil(ArrayList<Integer> arr, Node root) {
		if (root == null)
			return;

		inOrderUtil(arr, root.left);
		arr.add(root.data);
		inOrderUtil(arr, root.right);
	}

	static int findHeight(Node root) {
		if (root == null)
			return 0;
		int lH = findHeight(root.left);
		int rH = findHeight(root.right);
		if (lH > rH)
			return lH + 1;
		return rH + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Height tree = new Height();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		ArrayList<Integer> res = inOrder(tree.root);
		System.out.println(res);
		System.out.println("Height of the tree is " + findHeight(tree.root));
	}
}
