package interpretator;

public class Power implements Expression {
	
	private Expression left;
	private Expression right;
	
	public Power(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Power() {}
	
	
	
	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

	@Override
	public double evalate() {
		
		return Math.pow(left.evalate(), right.evalate()) ;
	}

}
