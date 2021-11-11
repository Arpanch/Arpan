package com.arpan.recusrsion.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int data;

	@Override
	public String toString() {
		return "Node [data=" + data + ", childrens=" + childrens + "]";
	}

	List<Node> childrens = new ArrayList<>();

	public Node(int data) {
		super();
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childrens == null) ? 0 : childrens.hashCode());
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (childrens == null) {
			if (other.childrens != null)
				return false;
		} else if (!childrens.equals(other.childrens))
			return false;
		if (data != other.data)
			return false;
		return true;
	}

}
