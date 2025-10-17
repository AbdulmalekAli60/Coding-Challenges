import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int i = 0;
        while (i < sArr.length) {

            char sCurrent = sArr[i];
            char tCurrent = tArr[i];

            if (sMap.containsKey(sCurrent)) {
                int currentVal = sMap.get(sCurrent);
                currentVal++;
                sMap.put(sCurrent, currentVal);
            } else {
                sMap.put(sCurrent, 1);
            }
            i++;
        }

        int j = 0;
        while (j < tArr.length) {

            char tCurrent = tArr[j];

            if (tMap.containsKey(tCurrent)) {
                int currentVal = tMap.get(tCurrent);
                currentVal++;
                tMap.put(tCurrent, currentVal);
            } else {
                tMap.put(tCurrent, 1);
            }
            j++;
        }

        return sMap.equals(tMap);
    }
}
