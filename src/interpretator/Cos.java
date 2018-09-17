package interpretator;

public class Cos implements Expression {
	
	private Expression expression;
	
	
	
	
	public Cos(Expression expression) {
		super();
		this.expression = expression;
	}

	@Override
	public double evalate() {
		// TODO Auto-generated method stub
		return Math.cos(expression.evalate());
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
