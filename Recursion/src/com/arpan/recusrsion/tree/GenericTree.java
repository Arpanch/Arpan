package com.arpan.recusrsion.tree;

public class GenericTree {
public static void main(String[] args) {
	Node root=GenericTreeUtils.createTree();
	GenericTreeUtils.printTree(root);
	System.out.println("Size of Tree "+ GenericTreeUtils.sizeOfTree(root));
}
}
