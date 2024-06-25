package datastructure.algorithm.sort.heap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HeapSort {
	Stack<Node> stk = new Stack<>();
	Queue<Node> q = new LinkedList<>();
	
	public void sort(Node root)
	{
		//q.add(root);
		stk.add(root);
		while(root != null)
		{
			if(root.getLeftnode() != null)
			{	
				q.add(root.getLeftnode());
				stk.add(root.getLeftnode());
			}
			if(root.getRightnode() != null)
			{	
				q.add(root.getRightnode());
				stk.add(root.getRightnode());
			}
			
			root = q.poll();	
		}	
		
	}
	
	public void printstk()
	{
		while(!stk.isEmpty())
		{
			System.out.println(" ==> "+stk.pop().getValue());
		}	
	}
	
	public void isMinHeapTree(Node root)
	{
		if(root == null)
			return;
		if((root.getLeftnode() != null) && (root.getValue() > root.getLeftnode().getValue()) && (root.getLeftnode().getValue() < root.getRightnode().getValue()))
		{
			int temp= root.getValue();
			root.setValue(root.getLeftnode().getValue());
			root.getLeftnode().setValue(temp);
			//sort(root.getLeftnode());
		}
		else if((root.getRightnode() != null) && (root.getValue() > root.getRightnode().getValue()) && (root.getLeftnode().getValue() > root.getRightnode().getValue()))
		{
			int temp= root.getValue();
			root.setValue(root.getRightnode().getValue());
			root.getRightnode().setValue(temp);
			//sort(root.getRightnode());
		}
		//return root;
			
	}
	
	public void print(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		
	//	q.add(root);
		System.out.println();
		while(root != null)
		{
			System.out.print(" ==> "+root.getValue());
			if(root.getLeftnode() != null)
				q.add(root.getLeftnode());
			if(root.getRightnode() != null)
				q.add(root.getRightnode());
			if(!q.isEmpty())
				root = q.remove();			
		}	
	}

}
