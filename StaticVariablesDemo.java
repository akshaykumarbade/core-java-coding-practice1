package com.practice;

public class StaticVariablesDemo {
	
	String name;
	int age;
	static String collegeName="MIT";
	static double percentage;
	
	public StaticVariablesDemo(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String printName(String name) {
		this.name=name;
		return this.name;
	}
	
	public String printName(String firstName, String lastName) {
		name = firstName+" "+ lastName;
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" Age: "+age+" CollegeName: "+collegeName+" Percentage: "+percentage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariablesDemo demo = new StaticVariablesDemo("Monica", 30);
		System.out.println(demo.name);
		System.out.println(demo.age);
		System.out.println(demo.toString());
		
		System.out.println(demo.printName("Nina"));
		System.out.println(demo.printName("Nina", "Smith"));
		System.out.println(demo.toString());

	}

}
