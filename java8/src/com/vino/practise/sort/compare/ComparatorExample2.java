package com.vino.practise.sort.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student
{
	int age;
	String name;
	public Student(int age, String name) {
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
	
	
}

public class ComparatorExample2 {
	
	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(56,"John"));
		student.add(new Student(48,"Kim"));
		student.add(new Student(77,"Albert"));
		student.add(new Student(63,"Andrew"));
		student.add(new Student(43,"Chandhu"));
		
		Comparator<Student> stud= (i,j) -> i.getAge()>j.getAge()?1:-1;
		
		Collections.sort(student, stud);
		System.out.println("Final Result : ");
		student.stream().sorted(stud).forEach(System.out::println);
		System.out.println("Using the Comparator Functional Interface directly in stream Final Result : ");
		student.stream().sorted((i,j) -> i.getAge()>j.getAge()?-1:1).forEach(System.out::println);
		
	}
	
	//Comparator<Student> stud= (i,j) -> ;
	
	
	

}
