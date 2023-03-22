package mediumComplexityProblem3;

import java.util.Arrays;

public class SwapNumbers {
    private int[] arr;
    //temp variable
    private int temp;
    private int lastNum;
    private boolean flag = false;

    public void swapEnds() {
        arr = new int[]{1, 2, 3, 7};
        //arr = new int[]{1, 6, 7, 9, 8};
        lastNum = arr[arr.length - 1];
        for (int i = 2; i <= lastNum / 2; ++i) {
            if (lastNum % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Last Array value:" + lastNum + " is not a prime number.");
            temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
            //printing modified array
            System.out.println("Modified Array is :" + Arrays.toString(arr));
        } else {
            System.out.println("Last Array value:" + lastNum + " is a prime number so elements are not swapped");
        }
    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        swapNumbers.swapEnds();
    }
}

