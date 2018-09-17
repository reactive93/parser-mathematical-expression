package statemachine;

import interpretator.SignPriority;

public class FunctionState implements State {

	@Override
	public void calculate(StateMachine machine) {
		int i=machine.getIterator();
		String expr = machine.getExpr();
		String s="";
		
		while(Character.isLetter(expr.charAt(i))) {
			s+=expr.charAt(i);
			i++;
		}
		
		machine.setIterator(i);
		machine.getStackOP().push(new SignPriority(s,3));
		machine.setState(new SignState());
		machine.nextState();

	}

}
