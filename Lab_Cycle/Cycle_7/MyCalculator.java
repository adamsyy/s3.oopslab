package Lab_Cycle.Cycle_7;


interface Add_Sub {
	public void add(double x, double y);
	public void subtract(double x, double y);
}

interface Mul_Div {
	public void multiply(double x, double y);
	public void divide(double x, double y);
}

interface Mycalculator extends Add_Sub, Mul_Div {
	public void printResult(double result);
}

public class MyCalculator implements Mycalculator {

	public void add(double x, double y)
	{
		double result = x + y;
		printResult(result);
	}

	public void subtract(double x, double y)
	{
		double result = x - y;
		printResult(result);
	}

	public void multiply(double x, double y)
	{
		double result = x * y;
		printResult(result);
	}

	public void divide(double x, double y)
	{
		double result = x / y;
		printResult(result);
	}

	public void printResult(double result)
	{
		System.out.println(
			"The result is : " + result);
	}

	public static void main(String args[])
	{

		MyCalculator c = new MyCalculator();
		c.add(5, 10);
		c.subtract(35, 15);
		c.multiply(6, 9);
		c.divide(45, 6);
	}
}
