package javaCodingTestAssignments1;

public class SpiralPattern {
    public void printSpiral(int size) {
        int row = 0, column = 0;
        int boundary = size - 1;
        int sizeRemain = size - 1;
        int flag = 1;
        String move = "right";
        int matrix[][] = new int[size][size];

        for (int index = 1; index <= size * size; index++) {
            matrix[row][column] = index;
            switch (move) {
                case "right":
                    column += 1;
                    break;
                case "left":
                    column -= 1;
                    break;
                case "up":
                    row -= 1;
                    break;
                case "down":
                    row += 1;
                    break;
            }
            // Check if the matrix has reached array boundary
            if (index == boundary) {
                // Add the remaining size for the next boundary
                boundary += sizeRemain;
                // If 2 rotations has been made, decrease the size left by 1
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeRemain -= 1;
                }
                // switch-case to rotate the movement
                switch (move) {
                    case "right":
                        move = "down";
                        break;
                    case "down":
                        move = "left";
                        break;
                    case "left":
                        move = "up";
                        break;
                    case "up":
                        move = "right";
                        break;
                }
            }
        }
        // Print the matrix
        for (row = 0; row < size; row++) {
            for (column = 0; column < size; column++) {
                int numbersFromMatrix = matrix[row][column];
                System.out.print((numbersFromMatrix < 10) ? (numbersFromMatrix + "  ") : (numbersFromMatrix + " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SpiralPattern spiralPattern = new SpiralPattern();
        spiralPattern.printSpiral(5);
    }
}
