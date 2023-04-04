package mediumComplexityProblem6;

public class ReverseString {
    public String reverseStrFunction(String inputString) {
        char[] inputCharArray = inputString.toCharArray();
        int startCounter = 0;
        int endCounter = inputCharArray.length - 1;
        while (startCounter < endCounter) {
            if (!Character.isLetterOrDigit(inputCharArray[startCounter])) {
                startCounter++;
            } else if (!Character.isLetterOrDigit(inputCharArray[endCounter])) {
                endCounter--;
            } else {
                char temp = inputCharArray[startCounter];
                inputCharArray[startCounter] = inputCharArray[endCounter];
                inputCharArray[endCounter] = temp;
                startCounter++;
                endCounter--;
            }
        }
        String reverse = new String(inputCharArray);
        return reverse;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("Reverse of 'Ro@hitshetty': " + reverseString.reverseStrFunction("Ro@hitshetty"));
        System.out.println("Reverse of 'Ro@h7it' is : " + reverseString.reverseStrFunction("Ro@h7it"));
    }
}
