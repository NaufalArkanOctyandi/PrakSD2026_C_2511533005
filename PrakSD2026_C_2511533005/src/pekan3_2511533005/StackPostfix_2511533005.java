package pekan3_2511533005;
import java.util.Stack;
import java.util.Scanner;
public class StackPostfix_2511533005 {
	public static int postfixEvaluate (String expression) {
		Stack<Integer> s= new Stack <Integer> ();
		Scanner input_3005= new Scanner (expression);
		while (input_3005.hasNext()) {
			if(input_3005.hasNextInt()) { 	// an operand (integer)
				s.push(input_3005.nextInt());
			} else {					// an operator
				String operator = input_3005.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals(" + ")) {
					s.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s.push(operand1 - operand2); 
				} else if (operator.equals("*")) {
					s.push(operand1 * operand2);
				} else {
					s.push(operand1 / operand2);			
			}
		}
		}	
		input_3005.close();
		return s.pop();
	}

	public static void main(String[] args) {
		System.out.println("hasil postfix= " + postfixEvaluate("5 2 4 * + 7 -"));

	}

}
