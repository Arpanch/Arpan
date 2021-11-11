package com.arpan.recusrsion.tree;

public class GenericTreeTraversal {
public static void main(String[] args) {


	Node root=GenericTreeUtils.createTree();
	if(root!=null)
	genericTreeTraversal(root);
	else {
		System.out.println("Tree is Empty.");
	}

}

private static void genericTreeTraversal(Node root) {
	
	
	System.out.println("Node pre "+root.data);
	for(Node node : root.childrens) {
		System.out.println("Edge pre "+root.data + "-->"+node.data);
		genericTreeTraversal(node);
		System.out.println("Node post "+node.data);
	}
	
}
}
