import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> resultList = new ArrayList<>(); // list of lists

        Map<String, List<String>> groupBySum = new HashMap<>();

        for(String currentString : strs){ // loop over strings

            int[] frequencyArray = new int[26]; // cretae array for each word

            for(char currentLetter : currentString.toCharArray()){ // loop over the char array

                frequencyArray[(int) currentLetter - 97]++;
            }

            String key = Arrays.toString(frequencyArray);

            if(!groupBySum.containsKey(key)){
                groupBySum.put(key, new ArrayList<>());
            }

            groupBySum.get(key).add(currentString);
        }

        return new ArrayList<>(groupBySum.values());
    }
}
