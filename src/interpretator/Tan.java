package interpretator;

public class Tan implements Expression {

	private Expression expression;
	
	public Tan(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public double evalate() {
		// TODO Auto-generated method stub
		return expression.evalate();
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
