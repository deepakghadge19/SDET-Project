package javaCodingTest;

public class ArmstrongNumber {
    public void armstrong(int startNumber, int lastNumber) {
        //Calculating number of digits
        for (int number = startNumber; number < lastNumber; number++) {
            int newNumber = number;
            int powerOfNumber = 0;
            while (newNumber != 0) {
                newNumber /= 10;
                powerOfNumber++;
            }
            // Calculating the sum of nth power of all the digits
            int sumOfPower = 0;
            newNumber = number;
            while (newNumber != 0) {
                int result = newNumber % 10;
                sumOfPower += Math.pow(result, powerOfNumber);
                newNumber /= 10;
            }
            // Checking if the current number is equal to the sum of nth power of all the digits
            if (sumOfPower == number) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        System.out.println("Armstrong Numbers are :");
        armstrongNumber.armstrong(50, 500);
    }
}
