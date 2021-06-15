package week10.lab10;
 public class ScientificCal extends AbstractCal{
	public ScientificCal(int num1, int num2) {
		super(num1, num2);
	}
	@Override
	public int Addition() {
		return input1+input2;
	}
	@Override
	public int Subtraction() {
		return input1-input2;
	}
	@Override
	public int Multiplication() {
		return input1*input2;
	}
	@Override
	public double Division() {
		return (double)input1/(double)input2;
	}
	public double logarit1() {
		return Math.log(input1);
	}
	public double logarit2() {
		return Math.log(input2);
	}
}