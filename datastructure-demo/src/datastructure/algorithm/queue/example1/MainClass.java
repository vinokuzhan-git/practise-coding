package datastructure.algorithm.queue.example1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals = new Animal();
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Cat("Kari"));
		animals.enqueue(new Dog("Beji"));
		animals.enqueue(new Cat("Reki"));
		animals.enqueue(new Dog("Dexter"));
		 
		animals.dequeueAny();
		animals.dequeueDogs();
		animals.dequeueCat();
	}

}
