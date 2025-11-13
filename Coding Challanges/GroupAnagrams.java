import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> resultList = new ArrayList<>(); // list of lists

        Map<Integer, List<String>> groupBySum = new HashMap<>();

        for (String currentString : strs) { // loop over strings

            char[] strToChar = currentString.toCharArray(); // convert current str to char array

            int sum = 0;
            for (char currentLetter : strToChar) { // loop over the char array

                sum += currentLetter; // get the current value of each char
            }

            System.out.println("The value that will be inserted to map: " + currentString + " " + sum);

            if (!groupBySum.containsKey(sum)) {
                groupBySum.put(sum, new ArrayList<>());
            }

            groupBySum.get(sum).add(currentString);
        }

        for (List<String> anagrams : groupBySum.values()) {
            resultList.add(anagrams);
        }

        return resultList;
    }
}
