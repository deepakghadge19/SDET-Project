package mediumComplexityProblem1;

public class IncomeTaxCalculation {
    private double totalTax;
    private int checkedCase;

    public void findIncomeTax(int taxableIncome) {
        checkedCase = (taxableIncome <= 700000) ? 1 : (taxableIncome > 500000 && taxableIncome <= 1000000) ?
                2 : (taxableIncome <= 1500000) ? 3 : 4;

        switch (checkedCase) {
            case 1:
                totalTax = 0;
                break;
            case 2:
                totalTax = (0.15 * (taxableIncome - 700000)) + (0.1 * 200000);
                break;
            case 3:
                totalTax = (0.2 * (taxableIncome - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
                break;
            case 4:
                totalTax = (0.3 * (taxableIncome - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
                break;
            default:
                System.out.println("Enter valid taxable income");
        }
        System.out.println("Income tax amount is :" + totalTax);
    }

    public static void main(String[] args) {
        IncomeTaxCalculation incomeTaxCalculation = new IncomeTaxCalculation();
        System.out.println("\nTotal Taxable Income : 700000");
        incomeTaxCalculation.findIncomeTax(700000);
        System.out.println("\nTotal Taxable Income : 800000");
        incomeTaxCalculation.findIncomeTax(800000);
        System.out.println("\nTotal Taxable Income : 1400000");
        incomeTaxCalculation.findIncomeTax(1400000);
        System.out.println("\nTotal Taxable Income : 1600000");
        incomeTaxCalculation.findIncomeTax(1600000);
    }
}
