package mediumComplexityProblem;

import java.util.Scanner;

public class IncomeTaxCalculation {

	public static void main(String[] args) {
		double tax = 0;
		double it;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income ");
		it = sc.nextDouble();
		if (it <= 500000) {
			tax = 0;
		} else if (it >= 500000 && it <= 700000) {
			tax = 0.1 * (it - 500000);
		} else if (it <= 1000000) {
			tax = (0.15 * (it - 700000)) + (0.1 * 200000);
		} else if (it <= 1500000) {
			tax = (0.2 * (it - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
		} else {
			tax = (0.3 * (it - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
		}
		System.out.println("Income tax amount is " + tax);
	}
}
