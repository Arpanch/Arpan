package com.arpan.recusrsion.tree;

public class HeightOfGenericTree {
public static void main(String[] args) {

	Node root=GenericTreeUtils.createTree();
	GenericTreeUtils.printTree(root);
	System.out.println("Height of Tree in terms of levels "+ heightOfGenericTree(root));
}

public static int heightOfGenericTree(Node root) {
	if(root==null) {
		return 0;
	}
	int height=0;
	for(Node node : root.childrens) {
		height=Math.max(height, heightOfGenericTree(node));
	}
	height=height+1;
	return height;
}
	
	
}
