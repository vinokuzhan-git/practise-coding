package com.example.interview.problem.enumclass;


enum Laptop
{
	//int price;
	DELL(100),APPLE(2000), HP(500), LENOVA;

	private int price;

	Laptop(int i) {
		// TODO Auto-generated constructor stub
		this.price=i;
	}

	public int getPrice() {
		return price;
	}

	Laptop() {
		// TODO Auto-generated constructor stub
		this.price=400;
	}
	}
public class EnumClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Laptop l : Laptop.values())
		{
			System.out.println(l.name() +" : "+l.ordinal() +" : "+l.getPrice());
		}	

	}

}
