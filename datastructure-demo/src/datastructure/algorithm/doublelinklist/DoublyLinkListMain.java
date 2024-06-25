package datastructure.algorithm.doublelinklist;

public class DoublyLinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkList dll = new DoubleLinkList();
		dll.insert(1);
		dll.insert(5);
		dll.insert(15);
		dll.insert(30);
		dll.print();
		System.out.println(" ");
		dll.insertInPosition(0, 0);
		dll.print();
		System.out.println(" ");
		dll.insertInPosition(12, 3);
		dll.print();
		System.out.println(" ");
		dll.insertInPosition(40, 6);
		dll.print();
		System.out.println(" ");
		
		
	}

}
