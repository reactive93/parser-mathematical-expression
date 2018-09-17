package interpretator;

public class Minus implements Expression {

	
	private Expression left;
	private Expression right;
	
	public Minus(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Minus() {}
	
	
	
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
		// TODO Auto-generated method stub
		return left.evalate()-right.evalate();
	}

}
