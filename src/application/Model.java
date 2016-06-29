package application;

public class Model {

	public float calculate(float no1, float no2, String op){
		float result;
		
		switch (op) {
		case "+":
			result = no1 + no2;
			break;
			
		case "-":
			result = no1 - no2;
			break;
			
		case "*":
			result = no1 * no2;
			break;
			
		case "/":
			if(no2 == 0)
				result = 0;
			else
				result = no1 / no2;
			break;
			
		default:
			result=0;
			break;
		}
		
		return result;
	}
}
