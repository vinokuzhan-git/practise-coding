package datastructure.algorithm.doublelinklist;

public class DoubleNode {
	private int data;
	private DoubleNode nextnode;
	private DoubleNode prevnode;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleNode getNextnode() {
		return nextnode;
	}
	public void setNextnode(DoubleNode nextnode) {
		this.nextnode = nextnode;
	}
	public DoubleNode getPrevnode() {
		return prevnode;
	}
	public void setPrevnode(DoubleNode prevnode) {
		this.prevnode = prevnode;
	}
}
