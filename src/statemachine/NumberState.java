package statemachine;

public class NumberState implements State {

	
	@Override
	public void calculate(StateMachine machine) {
		int i=machine.getIterator();
		String expr = machine.getExpr();
		String s="";
		if(machine.isIsunary()) {
			s+="-";
			i++;
			machine.setIsunary(false);
			
		}
		for(;i<expr.length();i++) {
			
			if(Character.isDigit(expr.charAt(i)) || expr.charAt(i)=='.' || expr.charAt(i)==',' ) {
				if(expr.charAt(i)==',') {
					s+='.';
				}
				else {
					s+=expr.charAt(i);
				}
				
			}
			else {
				break;
			}
			
		}
		machine.setIterator(i);
		machine.getList().add(s);
		machine.getHistoryState().add(this);
		machine.setState(new SignState());
		machine.nextState();
		
		
		
	}
	
	

}
