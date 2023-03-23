package mediumComplexityProblem1;
/*Q.1 Write a java program to find tax for employee. The program should
calculate the income tax to be paid by the employee as per the criteria given below:
Slab rate IT rate
Upto Rs. 7,00,000 Nil
Above Rs. 7,00,000 (0-5,00,000=nil,5,00,000 – 7,00,000=10%)
Rs. 7,00,000-10,00,000 15% on additional amount
Rs. 10,00,000-15,00,000 20% on additional amount Above 15,00,000 30% on additional amount
Result: - income tax is ……………………………. */

import java.util.Scanner;

public class IncomeTaxCalculation {
    private double totalTax;
    private double taxableIncome;

    public void findIncomeTax(double taxableIncome) {
        this.taxableIncome = taxableIncome;
        if (this.taxableIncome <= 700000) {
            totalTax = 0;
        } else if (this.taxableIncome > 500000 && this.taxableIncome <= 1000000) {
            totalTax = (0.15 * (this.taxableIncome - 700000)) + (0.1 * 200000);
        } else if (this.taxableIncome <= 1500000) {
            totalTax = (0.2 * (this.taxableIncome - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
        } else {
            totalTax = (0.3 * (this.taxableIncome - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
        }
        System.out.println("Income tax amount is :" + totalTax);
    }

    public static void main(String[] args) {
        IncomeTaxCalculation incomeTaxCalculation = new IncomeTaxCalculation();
        incomeTaxCalculation.findIncomeTax(1600000);
    }
}
/*OUTPUT :
Enter income : 700000
Income tax amount is :0.0

Enter income : 800000
Income tax amount is :35000.0

Enter income : 1400000
Income tax amount is :145000.0

Enter income : 1600000
Income tax amount is :195000.0
 */