package com.hcl.ojttraining_dayone_julytwse.dayonetopic.calc;

import java.util.Scanner;

import com.hcl.ojttraining_dayone_julytwse.dayonetopic.service.CalcService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ScientificCalculator extends CalcAbstract {
	double num1, num2;
	CalcService cs = new CalcService();

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

	public double pow(double num1, double num2) {
		return cs.pow(num1, num2);
	}

	public static void main(String[] args) {
		ScientificCalculator scalc = new ScientificCalculator(); // calls the constructor

		System.out.print("Enter the first number: ");
		Scanner scanner = new Scanner(System.in);

		scalc.num1 = scanner.nextDouble(); // inputs the scans for the first number
		System.out.print("Enter the second number: ");

		scalc.num2 = scanner.nextDouble(); // inputs the scans for the second number
		System.out.print("Enter a operator: ");

		var operation = scanner.next(); // inputs the scans for the operation

		switch (operation) {
		case "+":
			scalc.add(scalc.num1, scalc.num2);
			break;
		case "-":
			scalc.subtract(scalc.num1, scalc.num2);
			break;
		case "*":
			scalc.multiply(scalc.num1, scalc.num2);
			break;
		case "/":
			scalc.divide(scalc.num1, scalc.num2);
			break;
		case "**":
			scalc.pow(scalc.num1, scalc.num2);
		default:
			System.out.println("Sorry incorrect operation used!");
		}
		System.out.print("\nEnter 0 to quit or enter any other number to rerun");
		var runAgain = scanner.next();
		if (!runAgain.equals("0")) {
			ScientificCalculator.main(args);
		} else {
			System.out.println("Bye!");
		}
		scanner.close(); // closes the scan so no memory leak
	}

}
