package com.training.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

	private BSTnode<T> rootNode;

	public void add(T key) {
		rootNode = addKeyInBST(rootNode, key);
	}

	public BSTnode<T> addKeyInBST(BSTnode<T> root, T key) {

		if (root == null) {
			root = new BSTnode<>(key);
			return root;
		}
		if (key.compareTo(root.key) < 0) {
			root.left = addKeyInBST(root.left, key);
		} else if (key.compareTo(root.key) > 0) {
			root.right = addKeyInBST(root.right, key);
		}
		return root;
	}

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);

	}

}
