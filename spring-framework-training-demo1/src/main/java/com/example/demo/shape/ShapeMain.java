package com.example.demo.shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		Triangle t = new Triangle();
		
		Shape ts = new Triangle();
		
		ShapeInjector si = new ShapeInjector();
		si.setShape(shape);
		si.diagram();	
		si.setShape(t);
		si.diagram();
		si.setShape(ts);
		si.diagram();
	}

}
