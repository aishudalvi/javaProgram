package com.collection;


class User {
	  int id;
	  String name;

	 // Parameterized constructor to initialize id and name
	 public User(int id, String name) {
	     this.id = id;
	     this.name = name;
	 }

	 public int getId() {
	     return id;
	 }

	 public String getName() {
	     return name;
	 }
	}

	//Subclass Employee inheriting from User
	class Employee extends User {
	  double salary;

	 // Parameterized constructor to initialize id, name, and salary
	 public Employee(int id, String name, double salary) {
	     super(id, name); 
	     this.salary = salary;
	 }

	 //  calculate annual salary
	 public double calculateAnnualSalary() {
	     return salary * 12;
	 }
	}


public class AnnualSalaryEx {
	public static void main (String []args) {
		// Create an object of Employee class using the constructor
	     Employee employee = new Employee(5, "Shree bhosale", 7000);

	     // Calculate and display the annual salary
	     double annualSalary = employee.calculateAnnualSalary();
	     System.out.println("Annual Salary  " + employee.getName() + " (ID: " + employee.getId() + "): $" + annualSalary);
	}

}
