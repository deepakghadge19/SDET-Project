package mediumComplexityProblem7;

public class SortArray {
    public void ascendingSort(int[] inputArray) {
        // Sort elements of original array in ascending order
        int firstCounter;
        for (firstCounter = 0; firstCounter < inputArray.length; firstCounter++) {
            for (int secondCounter = firstCounter + 1; secondCounter < inputArray.length; secondCounter++) {
                if (inputArray[firstCounter] > inputArray[secondCounter]) {
                    int temp = inputArray[firstCounter];
                    inputArray[firstCounter] = inputArray[secondCounter];
                    inputArray[secondCounter] = temp;
                }
            }
        }
        // Remove duplicates element from Ascending sort Array
        int checkDuplicateCounter;
        int tempArrayCounter = 0;
        for (checkDuplicateCounter = 0; checkDuplicateCounter < inputArray.length - 1; checkDuplicateCounter++) {
            if (inputArray[checkDuplicateCounter] != inputArray[checkDuplicateCounter + 1]) {
                inputArray[tempArrayCounter] = inputArray[checkDuplicateCounter];
                tempArrayCounter++;
            }
        }
        inputArray[tempArrayCounter] = inputArray[inputArray.length - 1];

        //Displaying unique ascending sort elements from input array
        System.out.println("Unique ascending sort array elements:");
        for (checkDuplicateCounter = 0; checkDuplicateCounter <= tempArrayCounter; checkDuplicateCounter++) {
            System.out.print(inputArray[checkDuplicateCounter] + " ");
        }
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] numbers = new int[]{1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        sortArray.ascendingSort(numbers);
    }
}
