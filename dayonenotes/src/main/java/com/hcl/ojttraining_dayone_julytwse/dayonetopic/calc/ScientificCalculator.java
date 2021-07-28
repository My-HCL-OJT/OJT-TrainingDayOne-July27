package com.hcl.ojttraining_dayone_julytwse.dayonetopic.calc;

import java.util.Scanner;

import com.hcl.ojttraining_dayone_julytwse.dayonetopic.service.CalcService;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ScientificCalculator extends CalcAbstract {
	@NonNull double num1, num2;
	//constructor
	public ScientificCalculator(){
	}
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

		System.out.print("Enter the first number: ");
		Scanner scanner = new Scanner(System.in);

		var num1 = scanner.nextDouble(); // inputs the scans for the first number
		System.out.print("Enter the second number: ");

		var num2 = scanner.nextDouble(); // inputs the scans for the second number
		System.out.print("Enter a operator: ");
		ScientificCalculator scalc = new ScientificCalculator(num1,num2); // calls the constructor

		var operation = scanner.next(); // inputs the scans for the operation

		switch (operation) {
		case "+":
			scalc.add(scalc.getNum1(), scalc.getNum2());
			break;
		case "-":
			scalc.subtract(scalc.getNum1(), scalc.getNum2());
			break;
		case "*":
			scalc.multiply(scalc.getNum1(), scalc.getNum2());
			break;
		case "/":
			scalc.divide(scalc.getNum1(), scalc.getNum2());
			break;
		case "**":
			scalc.pow(scalc.getNum1(), scalc.getNum2());
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
