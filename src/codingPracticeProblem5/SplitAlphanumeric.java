package codingPracticeProblem5;

public class SplitAlphanumeric {
    public void splitString(String string) {
        StringBuffer alphabeticChar = new StringBuffer();
        StringBuffer numericChar = new StringBuffer();
        StringBuffer specialChar = new StringBuffer();

        for (int index = 0; index < string.length(); index++) {
            if (Character.isDigit(string.charAt(index))) {
                numericChar.append(string.charAt(index));
            } else if (Character.isAlphabetic(string.charAt(index))) {
                alphabeticChar.append(string.charAt(index));
            } else specialChar.append(string.charAt(index));
        }
        System.out.println("Alphabetic characters : " + alphabeticChar);
        System.out.println("Numeric characters : " + numericChar);
        System.out.println("Special characters : " + specialChar);
    }

    public static void main(String args[]) {
        SplitAlphanumeric splitAlphanumeric = new SplitAlphanumeric();
        splitAlphanumeric.splitString("ABc$123D!4");
    }
}
