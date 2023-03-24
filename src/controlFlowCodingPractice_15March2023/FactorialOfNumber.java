package controlFlowCodingPractice_15March2023;

public class FactorialOfNumber {
    public void findFactorial(int num) {
        int fact = 1; // To hold factorial
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of given number is : " + fact);
    }

    public static void main(String[] args) {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        factorialOfNumber.findFactorial(5);
    }

}
