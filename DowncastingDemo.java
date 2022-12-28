package com.practice;

public class DowncastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		//p.name="Nina";
		
		Child c = (Child)p;
		
		//c.age=26;
		//System.out.println(c.name);
		//System.out.println(c.age);
		c.showMessage();

	}

}

//Parent class  
class Parent {   
  String name;   
  
  // A method which prints the data of the parent class   
  void showMessage()   
  {   
      System.out.println("Parent method is called");   
  }   
} 


class Child extends Parent {   
    int age;   
    
    // Performing overriding  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
} 
