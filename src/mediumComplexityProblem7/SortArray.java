package mediumComplexityProblem7;

public class SortArray {
    public void ascendingSort(int[] inputArray) {
        int firstCounter;
        int secondCounter;
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (firstCounter = 0; firstCounter < inputArray.length; firstCounter++) {
            System.out.print(inputArray[firstCounter] + " ");
        }

        //Sort elements of original array in ascending order
        for (firstCounter = 0; firstCounter < inputArray.length; firstCounter++) {
            for (secondCounter = firstCounter + 1; secondCounter < inputArray.length; secondCounter++) {
                if (inputArray[firstCounter] > inputArray[secondCounter]) {
                    temp = inputArray[firstCounter];
                    inputArray[firstCounter] = inputArray[secondCounter];
                    inputArray[secondCounter] = temp;
                }
            }
        }
        System.out.println();

        //Displaying elements of original array after ascending sort
        System.out.println("Elements of original array sorted in ascending order: ");
        for (firstCounter = 0; firstCounter < inputArray.length; firstCounter++) {
            System.out.print(inputArray[firstCounter] + " ");
        }

        //Remove duplicates element from Ascending sort Array
        int[] tempArray = new int[inputArray.length];
        int checkDuplicateCounter;
        int tempArrayCounter = 0;
        for (checkDuplicateCounter = 0; checkDuplicateCounter < inputArray.length - 1; checkDuplicateCounter++) {
            if (inputArray[checkDuplicateCounter] != inputArray[checkDuplicateCounter + 1]) {
                tempArray[tempArrayCounter] = inputArray[checkDuplicateCounter];
                tempArrayCounter++;
            }
        }
        tempArray[tempArrayCounter] = inputArray[inputArray.length - 1];
        System.out.println();

        //Displaying elements from unique ascending sort array
        System.out.println("Unique ascending sort array elements:");
        for (firstCounter = 0; firstCounter <= tempArrayCounter; firstCounter++) {
            System.out.print(tempArray[firstCounter] + " ");
        }
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] numbers = new int[]{1, 2, 3, 9, 8, 7, 6, 5, 1, 2, 1};
        sortArray.ascendingSort(numbers);
    }
}
