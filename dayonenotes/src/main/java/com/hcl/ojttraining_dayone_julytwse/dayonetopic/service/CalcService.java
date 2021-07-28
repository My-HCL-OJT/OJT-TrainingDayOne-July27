package com.hcl.ojttraining_dayone_julytwse.dayonetopic.service;

public class CalcService {
	public double add(double num1, double num2) {
		var total = num1 + num2;
		System.out.printf("%.4f + %.4f = %.4f \n", num1, num2, total);
		return total;
	}

	public double subtract(double num1, double num2) {
		var total = num1 - num2;
		System.out.printf("%.4f - %.4f = %.4f \n", num1, num2, total);
		return total;
	}

	public double multiply(double num1, double num2) {
		var total = num1 * num2;
		System.out.printf("%.4f * %.4f = %.4f \n", num1, num2, total);
		return total;
	}

	public double divide(double num1, double num2) {
		var total = num1 / num2;
		System.out.printf("%.4f / %.4f = %.4f \n", num1, num2, total);
		return total;
	}

	public double pow(double num1, double num2) {
		var total = Math.pow(num1, num2);
		System.out.printf("%.4f / %.4f = %.4f \n", num1, num2, total);
		return total;
	}
}
