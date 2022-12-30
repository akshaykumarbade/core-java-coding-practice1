package com.practice;
//import java.io.*;
public class ExceptionInOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.message();
		
		C c = new C();
		c.message();
		

	}

}

class A{
	
	void message() {
		System.out.println("Parend class method");
	}
	
}

class B extends A{
	void message() //throws IOException
	{
		System.out.println("Child class method");
	}
	
	void getmsg() throws ArithmeticException{
		System.out.println("Child method");
	}
}

class C{
	void message() throws ArithmeticException{
		System.out.println("parent class method");
	}
}

class D extends C{
	void message() //throws Exception
	{
		System.out.println("Child class method");
	}
}
