package com.hcl.ojttraining_dayone_julytwse.dayonetopic.calc;

import java.util.Scanner;

import com.hcl.ojttraining_dayone_julytwse.dayonetopic.calcinterface.CalculatorI;
import com.hcl.ojttraining_dayone_julytwse.dayonetopic.service.CalcService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BasicCalculator implements CalculatorI {
	CalcService cs = new CalcService();
	double num1, num2;

	@Override
	public double add(double num1, double num2) {
		return cs.add(num1, num2);
	}

	@Override
	public double subtract(double num1, double num2) {
		return cs.subtract(num1, num2);
	}

	@Override
	public double multiply(double num1, double num2) {
		return cs.multiply(num1, num2);
	}

	@Override
	public double divide(double num1, double num2) {
		return cs.divide(num1, num2);
	}

	public static void main(String[] args) {
		BasicCalculator bcalc = new BasicCalculator();

		System.out.print("Enter the first number: ");
		Scanner scanner = new Scanner(System.in);

		var num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");

		var num2 = scanner.nextDouble();
		System.out.print("Enter a operator: ");

		String operation = scanner.next();

		switch (operation) {
		case "+":
			bcalc.add(bcalc.num1, bcalc.num2);
			break;
		case "-":
			bcalc.subtract(bcalc.num1, bcalc.num2);
			break;
		case "*":
			bcalc.multiply(bcalc.num1, bcalc.num2);
			break;
		case "/":
			bcalc.divide(bcalc.num1, bcalc.num2);
			break;
		default:
			System.out.println("Sorry incorrect operation used!");
		}
		System.out.print("Enter 0 to quit or enter any other number to rerun");
		var runAgain = scanner.next();
		if (!runAgain.equals("0")) {
			ScientificCalculator.main(args);
		} else {
			System.out.println("Bye!");
		}
		scanner.close(); // closes the scan so no memory leak
	}

}
