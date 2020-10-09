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
	
	/**
	 * to search the target element in the bst
	 */
	public void search(T key)
	{
		int result = searchKey(rootNode, key);
		if(result!=-1) {
			System.out.println("The key "+key+" is found at position "+result);
		}
		else
			System.out.println("The key "+key+" is not found");
	}
	
	/**
	 * recursively finding the key in the bst
	 */
	public int searchKey(BSTnode<T> root, T key)
	{
		int pos = 0, flag=0;
		if(root==null)
			return -1;
		while(root!=null)
		{
			if(root.key.compareTo(key)==0) {
				flag=1;
				break;
			}
			else if(root.key.compareTo(key)<0) {
				root = root.right;
				pos++;
			}
			else if(root.key.compareTo(key)>0) {
				root = root.left;
				pos++;
			}
		}
		if(flag==1)
			return pos+1;
		return -1;
	}

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(63);
		bst.size();
		bst.search(63);
		bst.search(12);
	}

}
