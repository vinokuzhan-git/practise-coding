package datastructure.algorithm.queue.example1;

import java.util.ArrayList;

public class Animal {
	
	private String name;
	private String type;
	ArrayList<String> namelist = new ArrayList<>(); 
	ArrayList<String> typelist = new ArrayList<>();
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void enqueue(Animal a)
	{
		namelist.add(a.name);
		typelist.add(a.type);
	}
	
	public void dequeueAny()
	{
		dequeue(null);
	}
	
	public void dequeueDogs()
	{
		dequeue("dog");
	}
	
	public void dequeueCat()
	{
		dequeue("cat");
	}
	
	public void dequeue(String type)
	{
		boolean flg = true;
		int i=0;
		while(flg)
		{
			if((typelist.get(i) != null) && ((type == null) || (type.equalsIgnoreCase(typelist.get(i)))))
			{
				flg = false;
				break;
			}	
			else
				i++;
		}
		
		if(!flg)
		{	
			System.out.println("Type :: "+typelist.get(i));
			System.out.println("Name :: "+namelist.get(i));
			namelist.remove(i);
			typelist.remove(i);
		}
		else
		{
			System.out.println("No Element found !!");
		}	
	}
	

}
