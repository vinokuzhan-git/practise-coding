package datastructure.algorithm.tree.binary.preorder;

public class LevelOrderTraversal {

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
				System.out.print(" --> "+root.getData());
				System.out.print(" --> "+root.getLeftNode().getData());
				System.out.print(" --> "+root.getRightNode().getData());
				traversal(root.getLeftNode(),root.getRightNode());
				

	}
	
	public static void traversal(Node lnode,Node rnode)
	{
		//System.out.println(" --> "+lnode.data);
		//System.out.println(" --> "+rnode.data);
		print(lnode);
		print(rnode);
		
		if((lnode.getLeftNode() != null) || (lnode.getRightNode() != null))
		{
			traversal(lnode.getLeftNode(),lnode.getRightNode());
		}	
		
		if((rnode.getLeftNode() != null) || (rnode.getRightNode() != null))
		{
			traversal(rnode.getLeftNode(),rnode.getRightNode());
		}
	}
	
	public static void print(Node node)
	{
		if(node.getLeftNode() != null)
			System.out.print(" --> "+node.getLeftNode().getData());
		if(node.getRightNode() != null)
			System.out.print(" --> "+node.getRightNode().getData());
	}

}
