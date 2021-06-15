package week10.lab10;

 public class RegularCal extends AbstractCal{
	
	public RegularCal(int num1, int num2) {
		super(num1, num2);
	}
	public int Addition() {
		return input1+input2;
	}
	public int Subtraction() {
		return input1-input2;
	}
	public int Multiplication() {
		return input1*input2;
	}
	public double Division() {
		return (double)input1/(double)input2;
	}
	
}