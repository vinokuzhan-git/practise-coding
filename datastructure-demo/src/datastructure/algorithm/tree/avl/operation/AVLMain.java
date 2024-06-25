package datastructure.algorithm.tree.avl.operation;

public class AVLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(5);
		BinaryOperations bp = new BinaryOperations();
		bp.insertNode(node, 3);
		bp.insertNode(node, 7);
		bp.insertNode(node, 6);
		
		System.out.println("Root : "+node.getValue());
		System.out.println("Left : "+node.getLeftnode().getValue());
		System.out.println("Right : "+node.getRightnode().getValue());
		System.out.println("Right Left : "+node.getRightnode().getLeftnode().getValue());
		bp.preorder(node);

	}

}
