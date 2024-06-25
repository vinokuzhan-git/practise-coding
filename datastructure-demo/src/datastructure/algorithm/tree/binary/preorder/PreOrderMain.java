package datastructure.algorithm.tree.binary.preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderMain {
	 
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stk = new Stack<Node>();
		Node llleaf = new Node(4);
		Node lrleaf = new Node(5);
		Node lrootnode = new Node(2,llleaf,lrleaf);
		
		Node rlleaf = new Node(6);
		Node rrleaf = new Node(7);
		Node rrootnode = new Node(3,rlleaf,rrleaf);
		Node rootnode = new Node(1,lrootnode,rrootnode);
		Node root = rootnode;
		traverse(rootnode);
		stk.push(root);
		while(!stk.isEmpty())
		{
			root = stk.pop();
			list.add(root.getData());
			if(root.getRightNode() != null)
				stk.push(root.getRightNode());
			if(root.getLeftNode() != null)
				stk.push(root.getLeftNode());
		}
		System.out.println("List : "+list);
		
	}
	public static void traverse(Node root)
	{
		 System.out.println(root.getData());
		if(root.getLeftNode() != null)
		{
			traverse(root.getLeftNode());
		}
		if(root.getRightNode() != null)
		{
			traverse(root.getRightNode());
		}
	}

}
