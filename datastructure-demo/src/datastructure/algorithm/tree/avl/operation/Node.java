package datastructure.algorithm.tree.avl.operation;

public class Node {
	
	private int value;
	private Node leftnode;
	private Node rightnode;
	public Node(int value) {
		super();
		this.value = value;
	}
	public Node(int value, Node leftnode, Node rightnode) {
		super();
		this.value = value;
		this.leftnode = leftnode;
		this.rightnode = rightnode;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeftnode() {
		return leftnode;
	}
	public void setLeftnode(Node leftnode) {
		this.leftnode = leftnode;
	}
	public Node getRightnode() {
		return rightnode;
	}
	public void setRightnode(Node rightnode) {
		this.rightnode = rightnode;
	}

}
