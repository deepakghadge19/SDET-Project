package mediumComplexityProblem2;

public class NumberPattern {
    private int i, j;

    public void pattern(int row) {
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPattern p1 = new NumberPattern();
        p1.pattern(4);
    }

}
