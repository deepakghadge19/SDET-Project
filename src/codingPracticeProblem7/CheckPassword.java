package codingPracticeProblem7;

public class CheckPassword {
    public boolean isValidPassword(String password) {
        int PASSWORD_LENGTH = 8;
        if (password.length() < PASSWORD_LENGTH) {
            return false;
        }
        int characterCount = 0;
        int numberCount = 0;
        for (int index = 0; index < password.length(); index++) {
            char character = password.charAt(index);
            if (isNumeric(character)) {
                numberCount++;
            } else if (isLetter(character)) {
                characterCount++;
            } else {
                return false;
            }
        }
        return (characterCount >= 2 && numberCount >= 2);
    }

    public static boolean isLetter(char character) {
        character = Character.toUpperCase(character);
        return (character >= 'A' && character <= 'Z');
    }

    public static boolean isNumeric(char character) {
        return (character >= '0' && character <= '9');
    }

    public static void main(String[] args) {
        CheckPassword checkPassword = new CheckPassword();
        String password = "Test1234";
        if (checkPassword.isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid: " + password);
        }
    }
}
