package poo.clases.ejercisios;

public class Account {

	private String 	id;
	private String 	name;
	private int		balance;
	
	
	public Account(String id,String name) {//Constructor No.1
		this.id = id;
		this.name = name;
		balance = 0;
	}
	
	
	public Account(String id, String name, int balance) {//Constructor No.2
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public String getID() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	
	public int credit(int amount) {
		balance = balance + amount;
		return balance;
	}
	
	
	public int debit(int amount) {
		if (amount<= balance) {
			balance = balance - amount;
		}else {
			System.out.println("Amount exxceeded balance");
		}
		return balance;
	}
	
	
	public int transferTo(Account another, int amount) {
		if(amount<=balance) {
			another.balance = amount;
		}else {
			System.out.println("Amount exceed balance");
		}
		return balance;
	}
	
	
	public String toString() {
		return "Account Data, ID: "+id+ " name: " +
		name + " Balance: " + balance;
 	}
	
	
}
	
	

