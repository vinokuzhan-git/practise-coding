package datastructure.algorithm.stack.example1;

import java.util.ArrayList;

public class SetOfStack {

	ArrayList<Integer> stack;
	ArrayList<ArrayList<Integer>> stacklist = new ArrayList<>();
	int capacity;
	
	public SetOfStack(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	public void push(int i)
	{
		if((stack == null) || (stack.size() >= capacity))
		{
			stack = new ArrayList<>();
			stacklist.add(stack);
		}	
		stack.add(i);
		
	}
	
	public int pop()
	{
		if((stack == null) || (stack.size() == 0))
		{
			System.out.println("Empty stack");
			return 0;
		}
		int result = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		if(stack.size() == 0)
		{	
			stacklist.remove(stacklist.size()-1);
			if(stacklist.size() > 0)
				stack=stacklist.get(stacklist.size()-1);
		}	
		
		return result;
	}
	
	public void printStack()
	{
		//ArrayList<Integer> stack1;
		stacklist.forEach((n) -> System.out.println(n)); 
	}

}
