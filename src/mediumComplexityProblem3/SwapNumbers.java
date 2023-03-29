package mediumComplexityProblem3;

import java.util.Arrays;

public class SwapNumbers {

    public void swapEnds(int[] arr) {
        //To find last array value
        int lastNum = arr[arr.length - 1];

        //Swap the first and last elements in the array,If the last array value is prime number
        if (lastNum % 2 == 0) {
            System.out.println("Last Array value:" + lastNum + " is not a prime number so elements are not swapped");
        } else {
            System.out.println("Last Array value:" + lastNum + " is a prime number.");
            int temp = arr[0];
            arr[0] = lastNum;
            arr[arr.length - 1] = temp;
            System.out.println("Modified Array after swap the first and last elements :" + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        int[] arr1 = new int[]{1, 2, 3, 7};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 6, 7, 9, 8};
        System.out.println("\n-------1st array of integers------------");
        swapNumbers.swapEnds(arr1);
        System.out.println("\n-------2nd array of integers------------");
        swapNumbers.swapEnds(arr2);
        System.out.println("\n-------3rd array of integers------------");
        swapNumbers.swapEnds(arr3);
    }
}

