package com.practice;

public class AbstractClassDemo extends AbstractClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ab = new AbstractClassDemo();
		ab.printMessage();
		ab.getFinal();
		

	}
	
	void printMessage() {
		System.out.println("Abstract class method implemented in child class");
	}
	

}

abstract class AbstractClass{
	
	AbstractClass(){
		System.out.println("Abstract class constructor");
	}
	
	abstract void printMessage();
	
	final void getFinal() {
		System.out.println("This is final method in Abstract class");
		printMessage();
	}
	
	static void getStatic() {
		System.out.println("This is static method in Abstrac class");
	}
}
