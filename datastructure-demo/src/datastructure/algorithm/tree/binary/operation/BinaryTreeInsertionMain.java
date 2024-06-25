package datastructure.algorithm.tree.binary.operation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node rlnode = new Node("N6");
		Node rrnode = new Node("N7");
		
		Node rnode = new Node("N3",rlnode,rrnode);
        Node lllnode = new Node("N8");
		Node llrnode = new Node("N9");

		Node llnode = new Node("N4",lllnode,llrnode);
		Node lrnode = new Node("N5");
		
		Node lnode = new Node("N2",llnode,lrnode);
		Node root = new Node("N1",lnode,rnode);
		
		print(root);
		insertNode(root,"N10");
		print(root);
		insertNode(root,"N11");
		print(root);
		insertNode(root,"N12");
		print(root);
	}

	public static void print(Node node)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		System.out.println(" Before while ");
		while(!q.isEmpty())
		{
			Node currentNode = q.remove();
			System.out.print(" --> "+currentNode.getData());
			
			if(currentNode.getLeftNode() != null)
				q.add(currentNode.getLeftNode());
			
			if(currentNode.getRightNode() != null)
				q.add(currentNode.getRightNode());
		}	
		System.out.println(" ");
	}
	
	public static void insertNode(Node node,String value)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		//System.out.println(" Before while ");
		while(!q.isEmpty())
		{
			Node currentNode = q.remove();
			//System.out.print(" --> "+currentNode.getData());
			
			if(currentNode.getLeftNode() != null)
				q.add(currentNode.getLeftNode());
			else
			{
				Node newnode = new Node(value);
				currentNode.setLeftNode(newnode);
				 return;
			}
			
			if(currentNode.getRightNode() != null)
				q.add(currentNode.getRightNode());
			   
			else
			{
				Node newnode = new Node(value);
				currentNode.setRightNode(newnode);
				 return;
			}
		}	
		System.out.println(" ");
	}
}
