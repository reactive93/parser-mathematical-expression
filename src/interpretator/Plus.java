package interpretator;

public class Plus implements Expression {

	private Expression left;
	private Expression right;
	
	public Plus(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Plus() {
		
	}
	
	
	
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

	public double evalate() {

		return left.evalate()+right.evalate();
	}

}
