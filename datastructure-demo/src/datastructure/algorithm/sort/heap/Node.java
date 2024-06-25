package datastructure.algorithm.sort.heap;

public class Node
{
	private Node leftnode;
	private Node rightnode;
	private int value;
	
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node(int value)
	{
		this.value=value;
	}
	public Node(Node l, Node r, int value)
	{
		this.leftnode=l;
		this.rightnode=r;
		this.value = value;
	}
	public String toString()
	{
		System.out.println("leftnode : "+this.leftnode+" "+"rightnode : "+this.rightnode+" value : "+value);
		return "";
	}
}
