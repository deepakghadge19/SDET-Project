package mediumComplexityProblem3;
/*Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
If the last array value is prime no.
swapEnds([1, 2, 3, 7]) → [7, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([1, 6, 7, 9, 8]) → [1, 6, 7, 9, 8] */

import java.util.Arrays;

public class SwapNumbers {
    private int temp;
    private int lastNum;
    private boolean flag = false;

    public void swapEnds(int[] arr) {
        //To find last array value
        lastNum = arr[arr.length - 1];
        //To check whether the last array value is a prime number
        for (int i = 2; i <= (lastNum / 2); ++i) {
            if (lastNum % i == 0) {
                flag = true;
                System.out.println("Last Array value:" + lastNum + " is not a prime number");
                break;
            }
        }
        //Swap the first and last elements in the array,If the last array value is prime number
        if (flag == false) {
            System.out.println("Last Array value:" + lastNum + " is a prime number.");
            temp = arr[0];
            arr[0] = lastNum;
            arr[arr.length - 1] = temp;
            //printing modified array
            System.out.println("Modified Array is :" + Arrays.toString(arr));
        } else {
            System.out.println("Last Array value:" + lastNum + " is not a prime number so elements are not swapped");
        }
    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        //int[] arr = new int[]{1, 2, 3, 7};
        int[] arr = new int[]{1, 6, 7, 9, 8};
        swapNumbers.swapEnds(arr);
    }
}

