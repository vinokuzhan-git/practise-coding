package datastructure.algorithm.tree.binary.preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderMain {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stk = new Stack<Node>();
		Node llleaf = new Node(4);
		Node lrleaf = new Node(5);
		Node lrootnode = new Node(2,llleaf,lrleaf);
		
		Node rlleaf = new Node(6);
		Node rrleaf = new Node(7);
		Node rrootnode = new Node(3,rlleaf,rrleaf);
		Node currentnode = new Node(1,lrootnode,rrootnode);
		Node root = currentnode;
		
		while((currentnode != null) || (!stk.isEmpty()))
		{
			//currentnode = null;
			
			
			while(currentnode != null)
			{
				stk.push(currentnode);
				currentnode = currentnode.getLeftNode();
			}
			
			currentnode = stk.pop();
			list.add(currentnode.getData());
			currentnode = currentnode.getRightNode();
			
		}
		System.out.println("List : "+list);
	}

}
