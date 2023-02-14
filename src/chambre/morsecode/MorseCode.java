package chambre.morsecode;

public class MorseCode {
    private static final String[] letters = {"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x",
            "y", "z"};
    private static final String[] morse = {"*-", "-***", "-*-*", "-**", "*",
            "**-*", "--*", "****", "**", "*---",
            "-*-", "*-**", "--", "-*", "---",
            "*--*", "--*-", "*-*", "***", "-",
            "**-", "***-", "*--", "-**-", "-*--",
            "--**", "|"};

    public String toMorseCode(String input) {
        String[] message = input.split("");
        StringBuilder result = new StringBuilder();

        for (String s : message) {
            for (int j = 0; j < letters.length; j++) {
                if (s.equalsIgnoreCase(letters[j])) {
                    result.append(morse[j]).append(" ");
                }
            }
        }

        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    public String toMessage(String morseCode) {
        String[] message = morseCode.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : message) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equalsIgnoreCase(morse[i])) {
                    result.append(letters[i]).append(" ");
                }
            }
        }
        return result.toString();
    }

}
