import java.util.Arrays;

public class AlphabetSoup {

    public AlphabetSoup() {}

    public boolean isPossible(String message, String letters) {
        // sort message
        String[] sortedMessage = message.split("");
        Arrays.sort(sortedMessage, String.CASE_INSENSITIVE_ORDER);

        // sort letters
        String[] sortedLetters = letters.split("");
        Arrays.sort(sortedLetters, String.CASE_INSENSITIVE_ORDER);

        // check
        int i = 0;
        for (int j = 0; j < sortedLetters.length; j++) {
            if (sortedMessage[i].equals(sortedLetters[j])) {
                if (i == sortedMessage.length - 1) {
                    return true;
                } else {
                    i++;
                }
            }
        }

        return false;
    }
}
