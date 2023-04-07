package mediumComplexityProblem9;

import java.util.ArrayList;
import java.util.List;

public class FindOddNumber {
    public Integer getElement(List<Integer> list, Integer indexOfOddNo) {
        int elementIndex = 2 * (indexOfOddNo - 1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
    }

    public static void main(String[] args) {
        FindOddNumber oddElements = new FindOddNumber();
        List<Integer> list = new ArrayList<Integer>();
        for (int counter = 1; counter <= 20; counter++) {
            list.add(counter);
        }
        System.out.println("5th odd number from list is : " + oddElements.getElement(list, 5));
        System.out.println("15th odd number from list is : " + oddElements.getElement(list, 15));
    }
}
