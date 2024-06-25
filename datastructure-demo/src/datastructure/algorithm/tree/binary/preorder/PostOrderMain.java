package datastructure.algorithm.tree.binary.preorder;

public class PostOrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node lchild1 = new Node(8,null,null);
		Node rchild1 = new Node(9,null,null);
		Node lchild2 = new Node(4,lchild1,rchild1);
		Node rchild2 = new Node(5,null,null);
		Node lchild3 = new Node(2,lchild2,rchild2);
		
		Node lchild4 = new Node(6,null,null);
		
		Node rchild4 = new Node(7,null,null);
		
		Node rchild5 = new Node(3,lchild4,rchild4);
		
		Node root = new Node(1,lchild3,rchild5);
		
		traversal(root);
		System.out.print(" --> "+root.getData());
	}
	
	public static void traversal(Node node)
	{
		if(node.getLeftNode() != null)
		{
			traversal(node.getLeftNode());
			System.out.print(" --> "+node.getLeftNode().data);
		}	
		
		if(node.getRightNode() != null)
		{
			traversal(node.getRightNode());
			System.out.print(" --> "+node.getRightNode().data);
		}
	}

}
