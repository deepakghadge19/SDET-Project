package mediumComplexityProblem7;

import java.util.Arrays;

public class SortArray {
    public void ascendingSort(int[] inputArray) {
        int firstCounter;
        int secondCounter = 0;
        Arrays.sort(inputArray);
        for (firstCounter = 0; firstCounter < inputArray.length - 1; firstCounter++) {
            if (inputArray[firstCounter] != inputArray[firstCounter + 1]) {
                inputArray[secondCounter] = inputArray[firstCounter];
                secondCounter++;
            }
        }
        inputArray[secondCounter] = inputArray[inputArray.length - 1];

        //Displaying unique ascending sort elements from input array
        System.out.println("Unique ascending sort array elements:");
        for (firstCounter = 0; firstCounter <= secondCounter; firstCounter++) {
            System.out.print(inputArray[firstCounter] + " ");
        }
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] numbers = new int[]{1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        sortArray.ascendingSort(numbers);
    }
}
