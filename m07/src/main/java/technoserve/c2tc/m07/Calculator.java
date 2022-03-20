package technoserve.c2tc.m07;

public class Calculator {
	CalculatorService cs;
	public Calculator(CalculatorService cs) {
		this.cs=cs;
	}
	int perform(int num1, int num2) {
		return num1*cs.sum(num1, num2);
	}

}
