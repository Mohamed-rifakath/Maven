package org.example;

public class Employee_Details {
	
         public Employee_Details() {
		
		System.out.println("default");
	
         }
	
	public Employee_Details(int b) {
		
		System.out.println(b);
	}
	
	  public Employee_Details(String a) {
		  
		  
		  System.out.println(a);
		  
		  
		  
		  
	  }
	  public static void main(String[] args) throws Throwable {
		Employee_Details obj = new Employee_Details("23");
		Employee_Details obj2= new Employee_Details("rifa");
		Employee_Details obj1 = new Employee_Details();
		obj.finalize();
		obj2.finalize();
	}

}
