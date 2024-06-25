package datastructure.algorithm.tree.avl.operation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AVLOperations {
	
	private int leftcount=0;
	private int rightcount=0;
	private Queue<Node> leftList = new LinkedList<>();
	private Queue<Node> rightList = new LinkedList<>();
	
	
	public Node rearrangeNode(Node node)
	{
		
		int count = isAVL(node);
		Node node1 = null;
		Stack<Node> stk = new Stack<>();
		Node rootNode;
		if((leftList.size()-rightList.size() > 1) || (rightList.size()-leftList.size() > 1))
		{
			if(count > 0)
			{
				
				int rootNodeIndex=(int) Math.ceil(count/2);
				while(rootNodeIndex < 1)
				{
					rootNode=leftList.poll();
					stk.add(rootNode);
					rootNodeIndex--;
				}	
			}
			else
			{
				count= count*-1;
				int rootNodeIndex=(int) Math.ceil(count/2);
				while(rootNodeIndex < 1)
				{
					rootNode=rightList.poll();
					stk.add(rootNode);
					rootNodeIndex--;
				}
			}	
			
			BinaryOperations b = new BinaryOperations();
			
			node1 = new Node(stk.pop().getValue());
			
			while(!stk.isEmpty())
			{
				b.insertNode(node1, stk.pop().getValue());
			}
			while(!leftList.isEmpty())
			{
				b.insertNode(node1, leftList.poll().getValue());
			}
			while(!rightList.isEmpty())
			{
				b.insertNode(node1, rightList.poll().getValue());
			}
			
		}	
		return node1;
		
		
		
		
		
	}
	
	private int isAVL(Node node)
	{
		leftcount=0;
		rightcount=0;
		int count=0;
		boolean avlFlag=false;
		Node lcurrentNode = node.getLeftnode();
		Node rcurrentNode = node.getRightnode();
		while(lcurrentNode != null)
		{
			leftcount++;
			leftList.add(lcurrentNode);
			lcurrentNode=lcurrentNode.getLeftnode();			
		}
		
		while(rcurrentNode != null)
		{
			rightcount++;
			leftList.add(rcurrentNode);
			rcurrentNode=rcurrentNode.getLeftnode();			
		}
		
		if(leftcount < rightcount-1)
		{
			avlFlag=false;
		}
		else if (leftcount >  rightcount-1)
		{
			avlFlag=false;
		}	
		else
		{
			avlFlag=true;
		}	
		if(!avlFlag)
			count=leftcount - rightcount;
		return count;
	}

}
