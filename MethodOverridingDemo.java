package com.practice;

public class MethodOverridingDemo {
	
	static String str = "Static string";
	static{System.out.println(str);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Shape();
		Shape s2 = new Rectangle();
		Shape s3 = new Square();
		
		
		s1.getArea();
		s2.getArea();
		s3.getArea();
		s1.getShape();
		s2.getShape();
		

	}

}

class Shape{
	String name;
	
	void getArea() {
		System.out.println("shape area");
	}
	
	Shape getShape(){ // covariant type method overriding
		System.out.println("This is shape");
		return this;
	}
	
	void getMethod() {
		System.out.println("Shape method called");
	}
	
}

class Rectangle extends Shape{
	int length=5;
	int breadth=6;
	
	void getArea() {
		int area=length * breadth;
		System.out.println(area);
	}
	
	Rectangle getShape() {// covariant type method overriding
		System.out.println("This is rectangle");
		return this;
	}
	
	void getMethod() {
		System.out.println("Rectangle method called");
	}
	

	
}

class Square extends Shape{
	int side=4;
	void getArea() {
		int area = side*side;
		System.out.println(area);
	}
}