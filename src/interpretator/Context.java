package interpretator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import statemachine.NumberState;
import statemachine.SignState;
import statemachine.StateMachine;
import util.CheckerPriority;

public class Context {
	
	
	private StateMachine machine = new StateMachine();

	
	public void evalate(String expr) throws Exception {
		expr = expr.replaceAll(" ", "");
		machine.setExpr(expr);
		
		if(Character.isDigit(expr.charAt(0))) {
			machine.setState(new NumberState());
			machine.nextState();
		}
		else {
			
			machine.setState(new SignState());
			machine.nextState();
		}
		CheckerPriority.popAll(this.machine.getStackOP(), this.machine.getList());
		if(this.machine.getList().contains("(")) {
			throw new Exception("no ( )");
		}
	}
	
	
	public double result() {
		List<String> list = this.machine.getList();
		Stack<Expression> stack = new Stack<>();

		for (String val : list) {
			
			if(val.length()>=1) {
				if (val.length()>1) {
					if(Character.isDigit(val.charAt(1))) {
						double value = Double.parseDouble(val);
						stack.push(new Operand(value));
					}
				}
				else if (Character.isDigit(val.charAt(0))) {
					double value = Double.parseDouble(val);
					stack.push(new Operand(value));

				}
				
			}


			if (val.charAt(0) == '+') {
				Expression expression = new Plus();
				this.createOnStack(stack, expression);
			}

			if (val.charAt(0) == '-' && val.length()==1) {
				Expression expression = new Minus();
				this.createOnStack(stack, expression);

			}

			if (val.charAt(0) == '/') {
				Expression expression = new Divide();
				this.createOnStack(stack, expression);

			}

			if (val.charAt(0) == '*') {
				Expression expression = new Mul();
				this.createOnStack(stack, expression);

			}
			
			if (val.charAt(0) == '^') {
				Expression expression = new Power();
				this.createOnStack(stack, expression);

			}
			
			if (val.equals("sin")) {
				Expression left = stack.pop();
				Sin sin = new Sin(left);
				stack.push(sin);
			}
			
			if (val.equals("cos")) {
				Expression left = stack.pop();
				Cos cos = new Cos(left);
				stack.push(cos);
			}
			
			if (val.equals("tan")) {
				Expression left = stack.pop();
				Tan tan = new Tan(left);
				stack.push(tan);
			}
			
		}

		return stack.pop().evalate();

	}
	
	private void createOnStack(Stack<Expression>stack,Expression expression) {
		Expression right = stack.pop();
		Expression left = stack.pop();
		expression.setLeft(left);
		expression.setRight(right);
		stack.push(expression);
		
	}
	
	public List<String> getRPN(){
		return this.machine.getList();
	}
	
}
