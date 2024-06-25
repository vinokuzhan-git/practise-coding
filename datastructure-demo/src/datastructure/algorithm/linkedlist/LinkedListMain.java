package datastructure.algorithm.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(0);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.show();
		list.insertRange(1, 1);
		list.show();
		list.insertRange(10, 0);
		list.show();
		list.insertRange(100, 3);
		list.show();
		list.delete(4);
		list.show();
		list.delete(10);
		list.show();
	}

}
