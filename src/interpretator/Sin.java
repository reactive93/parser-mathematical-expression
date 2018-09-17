package interpretator;

public class Sin implements Expression {
	
	private Expression val;
	
	public Sin(Expression val) {
		this.val=val;
	}
	
	@Override
	public double evalate() {
		
		return Math.sin(val.evalate());
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
