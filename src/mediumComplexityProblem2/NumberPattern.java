package mediumComplexityProblem2;

public class NumberPattern {
    private int row, column;

    public void pattern(int totalRow) {
        for (row = 1; row <= totalRow; row++) {
            for (column = 1; column <= totalRow - row; column++) {
                System.out.print(" ");
            }
            for (column = row; column >= 1; column--) {
                System.out.print(column);
            }
            for (column = 2; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPattern numberPattern = new NumberPattern();
        System.out.println("Number pattern as below :");
        numberPattern.pattern(4);
    }
}
