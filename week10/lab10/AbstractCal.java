package week10.lab10;

abstract public class AbstractCal{
	protected int input1;
	protected int input2;
	
	public AbstractCal(int num1, int num2) {
		this.input1 = num1;
		this.input2 = num2;
	}
	public abstract int Addition();
	public abstract int Subtraction();
	public abstract int Multiplication();
	public abstract double Division();
	
}