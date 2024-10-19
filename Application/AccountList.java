package application;
import java.util.ArrayList; 

// random id genration
import java.util.UUID; 

public class AccountList {
	private ArrayList<Account> accountList = new ArrayList<>(); // change when we add the db
	
	public void addAccount(String bankName, double balance, String date) {
		UUID rawID = UUID.randomUUID();
		String id = rawID.toString(); 
		
		accountList.add(new Account(id, bankName, balance, date)); // change when we add the db
	}
	
	public boolean deleteAccount(String id) {	
		for(int i=0; i<accountList.size(); i++) { // change when we add the db
			Account accountTemp = accountList.get(i); 
			
			if(accountTemp.getId() == id) {
				accountList.remove(i);
				return true; 
			}
		}
		
		return false;
	}
	
	public ArrayList<Account> getList(ArrayList<Account> accountList) { // return accounts list
	    return new ArrayList<>(accountList);
	}
		
}

