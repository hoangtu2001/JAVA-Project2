package week10.lab10;
 public class GeometryCal extends AbstractCal{
	public GeometryCal(int num1, int num2) {
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
	public double sin1() {
		return Math.sin(input1);
	}
	public double sin2() {
		return Math.sin(input2);
	}
}