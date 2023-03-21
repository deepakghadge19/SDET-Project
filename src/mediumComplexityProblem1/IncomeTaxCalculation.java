package mediumComplexityProblem1;

import java.util.Scanner;

public class IncomeTaxCalculation {
    private double tax;
    private double it;

    public void findIncomeTax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income :");
        it = sc.nextDouble();
        if (it <= 700000) {
            tax = 0;
        } else if (it > 500000 && it <= 1000000) {
            tax = (0.15 * (it - 700000)) + (0.1 * 200000);
        } else if (it <= 1500000) {
            tax = (0.2 * (it - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
        } else {
            tax = (0.3 * (it - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
        }
        System.out.println("Income tax amount is :" + tax);
    }

    public static void main(String[] args) {
        IncomeTaxCalculation a = new IncomeTaxCalculation();
        a.findIncomeTax();
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