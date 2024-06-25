package datastructure.algorithm.sort.heap;

public class HeapSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node llnode = new Node(4);
		Node lrnode = new Node(3);
		Node rlnode = new Node(2);
		Node rrnode = new Node(1);
		Node lnode = new Node(llnode,lrnode,5);
		Node rnode = new Node(rlnode,rrnode,6);
		Node root = new Node(lnode,rnode,7);
		
		System.out.println("root : "+root.getValue()+" root.left : "+root.getLeftnode().getValue()+" root.right : "+root.getRightnode().getValue());
		
		HeapSort hp = new HeapSort();
		
		hp.sort(root);
		hp.printstk();
		
	//	System.out.println("root : "+root.getValue()+" root.left : "+root.getLeftnode().getValue()+" root.right : "+root.getRightnode().getValue());
		
	//	hp.print(root);

	}

}
