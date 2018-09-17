package interpretator;

public interface Expression {
	
	
	
	public double evalate();
	
	public Expression getLeft();
	public void setLeft(Expression left);
	public Expression getRight();
	public void setRight(Expression right);
	
}
