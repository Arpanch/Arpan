package com.arpan.recusrsion.tree;

public class MaximumInGenericTree {
public static void main(String[] args) {

	Node root=GenericTreeUtils.createTree();
	System.out.println("Max of Tree "+ findMaxInTree(root));

}
public static int findMaxInTree(Node root) {
	if(root==null) {
		return Integer.MIN_VALUE;
	}
	int max=Integer.MIN_VALUE;
	for(Node node : root.childrens) {
		max=Math.max(max, findMaxInTree(node));
	}
	max=Math.max(max,root.data);
	return max;
}
}
