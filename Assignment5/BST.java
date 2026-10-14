package Assignment5;

public class BST {
	static class Node {
		Node left;
		Node right;
		int data;

		Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	Node root;
	Node parent;

	public BST() {
		root = null;
		parent = null;
	}

	public void add(int value) {
		Node newnode = new Node(value);

		if (root == null) {
			root = newnode;
		} else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else {
						trav = trav.left;
					}
				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else {
						trav = trav.right;
					}
				}
			}
		}
	}

	public int successor(int key) {
		Node trav = root;
		while (trav != null) {
			if (trav.data == key)
				break;
			else if (key < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null) {
			System.out.println("Key Not Found :");
			return -1;
		} else {
			Node parent = trav;
			Node successor = trav.right;
			while (successor.left != null) {
				parent = successor;
				successor = trav.left;
			}
			return successor.data;
		}

	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}

	public void preOrder() {
		System.out.println("preorder:");
		preorder(root);
		System.out.println();
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.println("inorder : ");

		inOrder(root);
	}

	public int deapth(int key) {
		Node trav=root;
		int deapth = 0;
		while (trav != null) {
			if (key == trav.data)
				return deapth;
			if (key < trav.data)
				trav = trav.left;

			else
				trav = trav.right;
			deapth++;
		}
		return -1;
	}

}
