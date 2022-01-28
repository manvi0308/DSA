package binary.tree;

import java.util.ArrayList;

import binary.tree.Diameter.Node;

public class Mirror {
	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	Mirror() {
		root = null;
	}

	Mirror(int key) {
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
	// Function to convert a binary tree into its mirror tree.
    static void mirror(Node node) {
        // Your code here
        
        if(node == null)
            return;
        
        else{
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            mirror(node.left);
            mirror(node.right);
        }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mirror tree = new Mirror();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		ArrayList<Integer> res = inOrder(tree.root);
		System.out.println(res);
		mirror(tree.root);
		ArrayList<Integer> res2 = inOrder(tree.root);
		System.out.println(res2);
	}
}


