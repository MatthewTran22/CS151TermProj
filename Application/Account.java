package application;

public class Account {
	
	private int id; 
	private String bankName; 
	private double balance; 
	private String date; 
	
	public Account(int id, String bankName, double balance, String date) {
		this.id = id; 
		this.bankName = bankName; 
		this.balance = balance; 
		this.date = date; 
	}
	
	// getters
	public int getId() {
		return id;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDate() {
		return date; 
	}
	
	
	// settors 
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
	}
	
	public void setDate(String date) {
		this.date = date; 
	}
	
	// add money
	public void addBalance(double balance, int addAmount) {
		this.balance = balance + addAmount; 
	}
	
	// withdraw money
	public void withdrawBalance(double balance, int drawAmount) {
		this.balance = balance - drawAmount; 
	}
}
