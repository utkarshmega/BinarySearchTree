package com.training.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

	private BSTnode<T> rootNode;

	/**
	 *to add node to the bst by calling the addKeyInBST method
	 */
	public void add(T key) {
		rootNode = addKeyInBST(rootNode, key);
	}

	/**
	 * To add new node to the bst by checking the conditions
	 */
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
	
	/**
	 * to print the size of the tree 
	 */
	public void size() {
		
		int size = sizeFunction(rootNode);
		System.out.println("The size of Binary Search Tree is " +size);
	}
	
	/**
	 * to calculate the size of the bst recursively
	 */
	public int sizeFunction(BSTnode<T> root)
	{
		if(root == null)
			return 0;
		return 1 + sizeFunction(root.left) + sizeFunction(root.right);
	}

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.size();
	}

}
