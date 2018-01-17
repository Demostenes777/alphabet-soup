import java.util.HashMap;
import java.util.Map;

public class AlphabetSoup {

    public AlphabetSoup() {}

    /**
     * Returns true if the message can be written with the given set of letters
     * @param message, message to be written
     * @param letters, set of available letters
     * @return true if possible, false otherwise
     */
    public boolean isPossible(String message, String letters) {

        // map character frequency
        Map<Character, Integer> messageMap = new HashMap<Character, Integer>();

        for(int i = 0; i < message.length(); i++) {
            if(messageMap.containsKey(message.charAt(i))) {
                messageMap.put(message.charAt(i), messageMap.get(message.charAt(i)) + 1);
            } else {
                messageMap.put(message.charAt(i), 1);
            }
        }

        // Check
        int pendingCharacters = messageMap.size();

        for (int j = 0; j < letters.length(); j++) {
            if (messageMap.containsKey(letters.charAt(j))) {
                messageMap.put(letters.charAt(j), messageMap.get(letters.charAt(j)) - 1);
                if (messageMap.get(letters.charAt(j)) == 0) {
                    pendingCharacters-- ;
                    if (pendingCharacters == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
