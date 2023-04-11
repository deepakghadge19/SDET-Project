package mediumComplexityProblem7;

public class SortArray {
    public void ascendingSort(int[] inputArray) {
        int uniqueArrayCounter = 0;
        int[] uniqueArray = new int[inputArray.length];
        // Sort the array in ascending order with unique element
        for (int firstCounter = 0; firstCounter < inputArray.length; firstCounter++) {
            for (int secondCounter = firstCounter + 1; secondCounter < inputArray.length; secondCounter++) {
                if (inputArray[firstCounter] > inputArray[secondCounter]) {
                    int temp = inputArray[firstCounter];
                    inputArray[firstCounter] = inputArray[secondCounter];
                    inputArray[secondCounter] = temp;
                }
            }
            if (uniqueArrayCounter == 0) {
                uniqueArray[uniqueArrayCounter] = inputArray[firstCounter];
                uniqueArrayCounter++;
            } else if (uniqueArray[uniqueArrayCounter - 1] != inputArray[firstCounter]) {
                uniqueArray[uniqueArrayCounter] = inputArray[firstCounter];
                uniqueArrayCounter++;
            }
        }
        //Displaying unique ascending sort elements from input array
        System.out.println("Unique ascending sort array elements:");
        for (int uniqueArrayIndex = 0; uniqueArrayIndex < uniqueArrayCounter; uniqueArrayIndex++) {
            System.out.print(uniqueArray[uniqueArrayIndex] + " ");
        }
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] numbers = new int[]{1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        sortArray.ascendingSort(numbers);
    }
}
