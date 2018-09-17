package interpretator;

public class Operand implements Expression {
	
	private double value;
	
	public Operand(double value) {
		this.value = value;
	}
	
	@Override
	public double evalate() {
		
		return this.value;
	}

	@Override
	public Expression getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeft(Expression left) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Expression getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRight(Expression right) {
		// TODO Auto-generated method stub
		
	}

}
