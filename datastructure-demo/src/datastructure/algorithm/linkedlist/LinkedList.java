package datastructure.algorithm.linkedlist;

public class LinkedList {
	private Node head;
	//private Node n;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.setData(data);
		
		if(head == null)
		{
			Node n=new Node();
			head=node;
			n.setNextnode(node);
		}
		else
		{
			Node n = head;
			while(n.getNextnode() != null)
			{
				n=n.getNextnode();
			}
			n.setNextnode(node);
		}
	}
	public void show()
	{
		Node n = head;
		
		while(n.getNextnode() != null)
		{
			System.out.print(n.getData()+" ");
			n=n.getNextnode();
		}
		System.out.println(n.getData()+" ");
		
	}
	
	public void insertRange(int data, int range)
	{
		Node newnode = new Node();
		newnode.setData(data);
		if((head == null) && (range > 1))
		{
			System.out.print("Invalid Range");
		}
		else if((head == null) && (range == 0))
		{
			head = newnode;
		}
		else
		{
			Node node = head;
			Node oldnode = new Node();
			oldnode=node;
			int i=0;
			while(node.getNextnode() != null)
			{
				
				
				if(range == 0 && i == 0)
				{	
					newnode.setNextnode(node);
					head = newnode;
					node=newnode;
				}
				else if(i == range)
				{
					oldnode.setNextnode(newnode);
					newnode.setNextnode(node);
					//newnode.setNextnode(n);
					//n.setData(data);
					
				}
				oldnode = node;
				node = node.getNextnode();
				i++;
			}
		}
	}

	public void delete(int data)
	{
		Node node = new Node();
		
		node = head;
		Node oldNode = node;
		
		while(node.getNextnode() != null)
		{
			if(head.getData() == data)
			{
				head = node.getNextnode();
			}
			else if(data == node.getData())
			{
				oldNode.setNextnode(node.getNextnode());
			}
			oldNode = node;
			node = node.getNextnode();
		}
	}
	

}
