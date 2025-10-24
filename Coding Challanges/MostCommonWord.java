import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {

    }

 public String mostCommonWord(String paragraph, String[] banned) {

        String paragraphLowerCase = paragraph.toLowerCase(); // make pharagraph lower case

        HashMap<String, Integer> wordsFreq = new HashMap<>();
        HashSet<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraphLowerCase.split("[^a-zA-Z]+"); // create new array from pharaghaph but without punctiasions and spaces


        for(String word : words) {
            // Skip empty strings and banned words
            if(!word.isEmpty() && !bannedWords.contains(word)) {
                wordsFreq.put(word, wordsFreq.getOrDefault(word, 0) + 1);
            }
        }

        // adding words and frequencis in the hashmap
        for(String w : words){

            if(!wordsFreq.containsKey(w)){
                wordsFreq.put(w, 1);
            }else{
                int freq = wordsFreq.get(w);
                freq++;
                wordsFreq.put(w, freq);
            }
        }

        // getting max value in in the hash map
        int maxFreq = 0;
        String maxValeuKey = "";

        for(Map.Entry<String, Integer> entry: wordsFreq.entrySet()){
            String currentKey = entry.getKey();
            int currentValue = entry.getValue();

            if(currentValue > maxFreq){
                maxFreq = currentValue;
                maxValeuKey = currentKey;
            }
        }

        return maxValeuKey;
    }
}
