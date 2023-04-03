package mediumComplexityProblem4;

public class MixString {
    public String mixWord(String firstString, String secondString) {
        int max = Math.max(firstString.length(), secondString.length());
        String result = "";
        for (int counter = 0; counter < max; counter++) {
            if (counter < firstString.length()) {
                result += firstString.substring(counter, counter + 1);
            }
            if (counter < secondString.length()) {
                result += secondString.substring(counter, counter + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MixString mixString = new MixString();
        System.out.println("Final word for string 'abc' and 'xyz' is : " + mixString.mixWord("abc", "xyz"));
        System.out.println("Final word for string 'Hi' and 'There' is : " + mixString.mixWord("Hi", "There"));
        System.out.println("Final word for string 'xxxx' and 'There' is : " + mixString.mixWord("xxxx", "There"));
    }
}
