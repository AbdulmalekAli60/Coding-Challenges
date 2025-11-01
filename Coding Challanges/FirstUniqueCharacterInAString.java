import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {

        if (s == null && s.isEmpty())
            return -1;

        HashMap<Character, Integer> frequenciesMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequenciesMap.put(c, frequenciesMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequenciesMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
