package com.training.binarysearchtree;

public class BSTnode<T> {

	T key;
	BSTnode<T> left = null;
	BSTnode<T> right = null;

	public BSTnode(T key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
