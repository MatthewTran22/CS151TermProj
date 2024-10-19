package application.controller;


import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class newAccController {

	@FXML DatePicker dateInput;
	@FXML TextField nameInput;
	@FXML TextField balanceInput;
	@FXML Label msgLabel;
	
	String name;
	double openBalance;
	String openDate;
	

	@FXML public void handleSubmitOP() {
		msgLabel.setText("");

		try {
			name = nameInput.getText();
			openBalance = Double.parseDouble(balanceInput.getText());
			openDate = dateInput.getAccessibleText();
			msgLabel.setText("Account added");
			
		}
		catch (Exception e) {
			msgLabel.setText("Invalid input");
			
		}
		
		
		
	}
	

}
