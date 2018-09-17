package interpretator;

public class Divide implements Expression {

	
	private Expression left;
	private Expression right;
	
	public Divide(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Divide() {}
	
	
	
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
		
		return left.evalate()/right.evalate();
	}

}
