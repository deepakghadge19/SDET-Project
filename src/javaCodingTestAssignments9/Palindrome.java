package javaCodingTestAssignments9;

public class Palindrome {
    public static boolean isPalindrome(String inputString) {

        char[] charString = inputString.toCharArray();
        int inputStringLength = inputString.length(), index;
        int differentCharCount = 0;
        char[][] tempArray = new char[2][2];

        // loops from the start of a string till the midpoint of the string
        for (index = 0; index < inputStringLength / 2; index++) {
            if (charString[index] != charString[inputStringLength - index - 1]) {
                if (differentCharCount == 2) {
                    return false;
                }
                // record the different character
                tempArray[differentCharCount][0] = charString[index];
                tempArray[differentCharCount++][1] = charString[inputStringLength - index - 1];
            }
        }
        switch (differentCharCount) {
            case 0:
                return true;
            case 1:
                char midChar = charString[index];
                if (inputStringLength % 2 != 0 && (tempArray[0][0] == midChar || tempArray[0][1] == midChar)) {
                    return true;
                }
            case 2:
                if ((tempArray[0][0] == tempArray[1][0] && tempArray[0][1] == tempArray[1][1]) ||
                        (tempArray[0][0] == tempArray[1][1] && tempArray[0][1] == tempArray[1][0])) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Input string is 'bbg' :" + isPalindrome("bbg"));
        System.out.println("Input string is 'gcagac' :" + isPalindrome("gcagac"));
    }
}
