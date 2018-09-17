package interpretator;

public class SignPriority {
	
	String sign;
	int priority;
	
	
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public SignPriority() {
		
	}
	public SignPriority(String sign, int priority) {
		super();
		this.sign = sign;
		this.priority = priority;
	}
	
	
}
