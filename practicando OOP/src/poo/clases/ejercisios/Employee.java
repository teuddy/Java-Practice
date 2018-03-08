package poo.clases.ejercisios;

public class Employee {

	private int 	id;
	private String 	firstName;
	private String 	lastName;
	private int		salary;
	
	
	public Employee(int id,String firstName,String lastName,int salary) {//Constructor
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public int getID() {
		return id;
	}

	
	public String getFistName() {
		return firstName;
	}
	
	
	public String getlastName() {
		return lastName;
	}
	
	
	public String getName() {
		return "The firstName is " + firstName + " and the lastName is " + lastName; 
	}
	
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		return salary * percent;
	}
	
	public String toString() {
		return  "The Employee ID is " + id + " the firstname: " + firstName + "The lastName: " + lastName + 
		" and the salary: " + salary;
	}
	
}











