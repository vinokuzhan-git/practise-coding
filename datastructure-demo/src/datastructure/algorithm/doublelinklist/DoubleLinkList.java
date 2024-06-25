package datastructure.algorithm.doublelinklist;

public class DoubleLinkList {
	
	private DoubleNode head;
	private DoubleNode tail = new DoubleNode();
	private int size = 0;
	
	public void insert(int nodeValue)
	{
		DoubleNode newnode = new DoubleNode();
		DoubleNode node = new DoubleNode();
		//DoubleNode oldnode = new DoubleNode();
		newnode.setData(nodeValue);
		
		if(head == null)
		{
			head = new DoubleNode();
			// System.out.println("inside head : "+newnode.getData());
			newnode.setNextnode(null);
			newnode.setPrevnode(null);
			head = newnode;
			tail = newnode;
		}	
		else
		{
			// System.out.println("inside else : "+newnode.getData());
			node=head;
			//oldnode = node;
			while(node.getNextnode() != null)
			{
				//oldnode = node;
				node = node.getNextnode();
				
			}
			node.setNextnode(newnode);
			newnode.setPrevnode(node);
			newnode.setNextnode(null);
			tail = newnode;
		}
	}
	
	public void print()
	{
		DoubleNode node = new DoubleNode();
		node = head;
		System.out.println("Head Value : "+node.getData());
		while(node.getNextnode() != null)
		{
			System.out.println("Value : "+node.getData());
			node = node.getNextnode();			
		}
		System.out.println("Value : "+node.getData());
		System.out.println("Tail Value : "+node.getData());
			
	}
	
	public void insertInPosition(int nodeValue, int position)
	{
		int count=0;
		DoubleNode newnode = new DoubleNode();
		DoubleNode node = new DoubleNode();
		DoubleNode prevnode = new DoubleNode();
		newnode.setData(nodeValue);
		node = head;
		if(position == 0)
		{
			newnode.setNextnode(head);
			newnode.setPrevnode(null);
			head.setPrevnode(newnode);
			head=newnode;
		}
		else
		{
			while(node != null)
			{
				System.out.println("count : "+count);
				prevnode = node;
				if(position == count)
				{
					//System.out.println("count Matched : "+count);
					//System.out.println("newnode.setNextnode : "+node.getData());
					//System.out.println("newnode.setPrevnode : "+node.getPrevnode().getData());
					//System.out.println("node.setPrevnode : "+newnode.getData());
					newnode.setNextnode(node);
					newnode.setPrevnode(node.getPrevnode());
					node.getPrevnode().setNextnode(newnode);
					node.setPrevnode(newnode);
					count++;
					break;
				}	
				else
				{
					node = node.getNextnode();
				}
				count++;
			}
			if(position == count)
			{
				System.out.println("count Matched : "+count);
				newnode.setPrevnode(prevnode);
				newnode.setNextnode(null);
				prevnode.setNextnode(newnode);
			}	
		}
		node = head;
		while(node != null)
		{
			tail = node;
			System.out.println("node value : "+node.getData());
			node = node.getNextnode();
		}
	}

}
