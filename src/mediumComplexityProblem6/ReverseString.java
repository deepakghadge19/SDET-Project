package mediumComplexityProblem6;

public class ReverseString {
    public void reverseStringOperation(char[] inputCharArray) {
        int startCounter = 0;
        int endCounter = inputCharArray.length - 1;
        while (startCounter < endCounter) {
            if (!Character.isAlphabetic(inputCharArray[startCounter])) {
                startCounter++;
            } else if (!Character.isAlphabetic(inputCharArray[endCounter])) {
                endCounter--;
            } else {
                char temp = inputCharArray[startCounter];
                inputCharArray[startCounter] = inputCharArray[endCounter];
                inputCharArray[endCounter] = temp;
                startCounter++;
                endCounter--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String inputString = "Ro@hitshetty";
        System.out.println("Input String :" + inputString);
        char[] chaArray = inputString.toCharArray();
        reverseString.reverseStringOperation(chaArray);
        String reverse = new String(chaArray);
        System.out.println("Reverse output string is :" + reverse);
    }
}
