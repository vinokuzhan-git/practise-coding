package datastructure.algorithm.tree.avl.operation;

import java.util.Stack;

public class BinaryOperations {
	
	public void insertNode(Node root, int value)
	{
		Node node = root;
		Node prev=root;
		boolean leftflg = false;
		
		while(node != null)
		{
			prev=node;
			leftflg = false;
			if(node.getValue() <= value)
			{
				node= node.getRightnode();
			}	
			else
			{
				node= node.getLeftnode();
				leftflg = true;
			}
		}	
		
		Node newnode = new Node(value);
		if(leftflg)
			prev.setLeftnode(newnode);
		else
			prev.setRightnode(newnode);
		
	}
public void preorder(Node root)
{
	Node node = root;
	System.out.println("Root : "+node.getValue());
	System.out.println("Left : "+node.getLeftnode().getValue());
	System.out.println("Right : "+node.getRightnode().getValue());
	System.out.println("Right Left : "+node.getRightnode().getLeftnode().getValue());
	Stack<Node> stk = new Stack<>();
	stk.add(node);
	Node currentNode=node;
	
	while(!stk.isEmpty() || currentNode !=null)
	{
		while(currentNode != null)
		{
			printf(currentNode);
			currentNode = currentNode.getLeftnode();
			
			stk.add(currentNode);
		}
		
		if(!stk.isEmpty())
		{	
			currentNode=stk.pop();
		}	
		if(currentNode != null)
		{	
			currentNode= currentNode.getRightnode();
			//printf(currentNode);
		}	
	}	
	
	
	
	
	
}

public void printf(Node node)
{
	if(node != null)
	System.out.print("--> "+node.getValue());
}

}
