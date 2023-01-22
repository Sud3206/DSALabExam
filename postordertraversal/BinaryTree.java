package com.postordertraversal;

public class BinaryTree {
	 Node root;

	    void postorder() {
	        postorder(root);
	    }

	    void postorder(Node node) {
	        if (node != null) {
	            postorder(node.left);
	            postorder(node.right);
	            System.out.print(node.data + " ");
	        }
	    }
}