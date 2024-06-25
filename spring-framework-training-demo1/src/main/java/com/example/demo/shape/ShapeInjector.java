package com.example.demo.shape;

public class ShapeInjector {
	
	Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void diagram()
	{
		shape.draw();
	}

}
