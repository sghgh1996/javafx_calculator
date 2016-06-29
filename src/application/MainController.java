package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {
	
	@FXML
	private Label result;
	
	private float no1 = 0;
	private float no2 = 0;
	private String op = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processNumbers(ActionEvent e){
		if(start){
			result.setText(" ");
			start = false;
		}
		String value = ((Button)e.getSource()).getText();
		result.setText(result.getText() + value);
	}
	
	@FXML
	public void processOperators(ActionEvent e){
		String value = ((Button)e.getSource()).getText();
	
		if (!value.equals("=")) {
			if(!op.isEmpty()){
				return;
			}
			op = value;
			no1 = Float.parseFloat(result.getText());
			result.setText(value);
			start = true;
		} else {
			if(op.isEmpty()){
				return;
			}
			float no2 = Float.parseFloat(result.getText()); 
			float out = model.calculate(no1, no2, op);
			result.setText(String.valueOf(out));
			op = "";
			start=true;
		}
	}
}
