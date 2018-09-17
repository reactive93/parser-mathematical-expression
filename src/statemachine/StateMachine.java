package statemachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import interpretator.SignPriority;
import util.CheckerPriority;

public class StateMachine {
	
	private State state;
	
	
	private List<String> list = new ArrayList<>();
	private List<State>historyState = new ArrayList<>();
	private boolean isunary=false;
	private String expr;
	private int iterator=0;
	
	private Stack<SignPriority> stackOP = new Stack<>();
	
	
	public List<String> getList() {
		return list;
	}

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}

	public int getIterator() {
		return iterator;
	}

	public void setIterator(int iterator) {
		this.iterator = iterator;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	public List<State> getHistoryState() {
		return historyState;
	}
	
	
	public boolean isIsunary() {
		return isunary;
	}

	public void setIsunary(boolean isunary) {
		this.isunary = isunary;
	}

	
	
	public Stack<SignPriority> getStackOP() {
		return stackOP;
	}

	public void nextState() {
		
		if(iterator< expr.length()) {
			this.state.calculate(this);
		}
		else {
			return;
		}
		
		
		
	}

}
