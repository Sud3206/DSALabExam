package com.postordertraversal;

public class PostOrder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(61);
        tree.root.left = new Node(52);
        tree.root.right = new Node(83);
        tree.root.left.left = new Node(44);
        tree.root.left.right = new Node(65);
        System.out.println("Postorder traversal of binary tree:");
        tree.postorder();
	}

}
