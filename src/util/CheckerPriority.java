package util;

import java.util.List;
import java.util.Stack;

import interpretator.SignPriority;

public class CheckerPriority {

	
	
	public static void checkAndPush(Stack<SignPriority>stack,List<String>list,SignPriority sign) {
		if(!stack.isEmpty()) {
			if(sign.getSign().equals("(")) {
				stack.push(sign);
				
				return;
			}
			
			if(stack.peek().getPriority()>=sign.getPriority()) {
				SignPriority signPriority = stack.pop();
				list.add(signPriority.getSign());
				stack.push(sign);
				return;
				
			}

			else {

				stack.push(sign);
			}
		}
		else {
			stack.push(sign);
		}
		
	}
	
	public static void popAll(Stack<SignPriority>stack,List<String>list) {
		
		while(!stack.isEmpty()) {
			list.add(stack.pop().getSign());
		}
		
	}
	
}
