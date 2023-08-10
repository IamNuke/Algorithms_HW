package ex4;

public class PasswordVerifier {
    public boolean  PasswordIsCorrect(String password){

        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;

        for (int i = 0; i < password.length(); i++) {
            currentCharacter = password.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            }
        }

        if (password.length() < 8){
            throw new IncorrectNumberOfSymbols("The password must be at least 8 characters long." );
        } else if (!upperCasePresent) {
            throw new NoCapitalLetterException("The password must contain at least one capital letter.");
        } else if (!numberPresent) {
            throw new NoDigitException("The password must contain at least one digit.");
        }else {
            return true;
        }
    }
}
