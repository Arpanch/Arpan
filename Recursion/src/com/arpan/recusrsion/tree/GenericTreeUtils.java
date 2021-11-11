package com.arpan.recusrsion.tree;

public class GenericTreeUtils {

	public static Node createTree() {

		Node root = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(50);
		Node node5 = new Node(6);
		Node node6 = new Node(7);
		Node node7 = new Node(8);
		Node node8 = new Node(9);

		root.childrens.add(node1);
		root.childrens.add(node2);
		root.childrens.add(node3);
		node1.childrens.add(node4);
		node1.childrens.add(node5);
		node1.childrens.add(node6);
		node3.childrens.add(node7);
		node7.childrens.add(node8);
		return root;
	}
	
	public static void printTree(Node node) {
		if(node==null) {
			System.out.println("There Tree is empty");
		}else {
			printCompleteTree(node);
		}
	}

	private static void printCompleteTree(Node node) {
		
		System.out.print(node.data+"-->");
		for(Node child : node.childrens) {
			System.out.print(child.data+", ");
		}
		System.out.println();
		for(Node child : node.childrens) {
			printCompleteTree(child);
		}
	}
	
	public static int sizeOfTree(Node root) {
		if(root==null) {
			return 0;
		}
		int size=0;
		for(Node node  : root.childrens) {
			size=size+sizeOfTree(node);
		}
		size=size+1;//for root
		return size;
	}
}
