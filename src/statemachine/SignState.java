package statemachine;

import interpretator.SignPriority;
import util.CheckerPriority;

public class SignState implements State {

	@Override
	public void calculate(StateMachine machine) {
		
		int i=machine.getIterator();
		String expr = machine.getExpr();
		String s="";
		//
		if(i>expr.length()) {
			return;
		}
// unary		
		if( expr.charAt(i)=='-' && Character.isDigit(expr.charAt(i+1)) && i==0 ) {
			
			
			machine.setIsunary(true);
			machine.setState(new NumberState());
			machine.nextState();
			
		}
		else if(expr.charAt(i)=='-' && Character.isDigit(expr.charAt(i+1)) && i>0 && !Character.isDigit(expr.charAt(i-1))) {
			machine.setIsunary(true);
			machine.setState(new NumberState());
			machine.nextState();
			
		}
//-----unary		
		else if ( expr.charAt(i)=='-' && Character.isDigit(expr.charAt(i-1)) ) {
			
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("-",1));
			machine.setIterator( machine.getIterator()+1);
			machine.setIsunary(false);
			machine.nextState();
			
			
			
		}
		
		else if (expr.charAt(i)=='+') {
			
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("+",1));
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
			
		}
		
		else if(expr.charAt(i)=='/') {
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("/",2));
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
		}
		
		else if(expr.charAt(i)=='*') {
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("*",2));
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
		}
		
		else if(expr.charAt(i)=='^') {
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("^",3));
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
		}
		
		else if(expr.charAt(i)=='(') {
			CheckerPriority.checkAndPush(machine.getStackOP(), machine.getList(), new SignPriority("(",-1));
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
		}
		
		else if(expr.charAt(i)==')') {
			
			SignPriority temp = machine.getStackOP().pop();
			try {
				while(!temp.getSign().equals("(")) {
					
					machine.getList().add(temp.getSign());
					temp = machine.getStackOP().pop();
					
				}
			}catch(Exception e) {
				System.out.println("no one of ''(''  ");
			}

			
			machine.setIterator( machine.getIterator()+1);
			machine.nextState();
		}
		
		else if (Character.isLetter(expr.charAt(i))) {
			
			machine.setState(new FunctionState());
			machine.nextState();
		}
		
		else if (Character.isDigit(expr.charAt(i))) {
			
			machine.setState(new NumberState());
			machine.nextState();
		}
		

	}

}
