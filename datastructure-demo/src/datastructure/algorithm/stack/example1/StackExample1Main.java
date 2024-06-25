package datastructure.algorithm.stack.example1;

public class StackExample1Main {

	public static void main(String[] args) {
		SetOfStack stacks = new SetOfStack(3);
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		stacks.printStack();
		stacks.pop();
		stacks.printStack();
		stacks.pop();
		stacks.pop();
		stacks.printStack();
		stacks.pop();
		stacks.pop();
		stacks.printStack();
		stacks.pop();

	}

}
