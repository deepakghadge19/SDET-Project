package firstAssignment;

public class CharactersEqualOccurrences {
    public boolean areOccurrencesEqual(String inputString) {
        int size = inputString.length();
        int[] counts = new int[size];
        int max = 0;

        for (char inputChar : inputString.toCharArray()) {
            counts[inputChar - 'a']++;
            max = Math.max(max, counts[inputChar - 'a']);
        }

        for (int count : counts) {
            if (count != 0 && count != max) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CharactersEqualOccurrences charactersEqualOccurrences = new CharactersEqualOccurrences();
        String firstInput = "abacbc";
        String SecondInput = "aaabb";
        System.out.println("String abacbc is : " + charactersEqualOccurrences.areOccurrencesEqual(firstInput));
        System.out.println("String abacbc is : " + charactersEqualOccurrences.areOccurrencesEqual(SecondInput));
    }
}
