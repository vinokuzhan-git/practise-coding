package com.vino.practise.sort.compare;

import java.util.*;

class Studenttest implements Comparable<Studenttest>
{
	int age;
	String name;
	public Studenttest(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Studenttest that) {
		// TODO Auto-generated method stub
		return this.getAge()>that.getAge()?1:-1; 
	}
	
	
}

public class ComparableExample {
	
	public static void main(String[] args) {
		List<Studenttest> student = new ArrayList<Studenttest>();
		student.add(new Studenttest(56,"John"));
		student.add(new Studenttest(48,"Kim"));
		student.add(new Studenttest(77,"Albert"));
		student.add(new Studenttest(63,"Andrew"));
		student.add(new Studenttest(43,"Chandhu"));
		System.out.println("Final Result : ");
		student.stream().sorted().forEach(System.out::println);
		
	}

}
