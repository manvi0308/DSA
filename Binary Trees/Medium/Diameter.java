package binary.tree;

import java.util.ArrayList;

import binary.tree.Height.Node;

public class Diameter {
	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	Diameter() {
		root = null;
	}

	Diameter(int key) {
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

	static int findDiameter(Node root) {
		return findDiameterUtil(root) + 1;
	}

	static int findDiameterUtil(Node root) {
		if(root == null)
			return 0;
		int lH = findHeight(root.left);
		int rH = findHeight(root.right);
		int lD = findDiameterUtil(root.left);
		int rD = findDiameterUtil(root.right);

		return Math.max(lH + rH + 1, Math.max(lD, rD));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diameter tree = new Diameter();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		ArrayList<Integer> res = inOrder(tree.root);
		System.out.println(res);
		System.out.println("Height of the tree is " + findHeight(tree.root));
		System.out.println("Diameter of the tree is " + findDiameter(tree.root));
	}
}
