import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {

    }

    public String mostCommonWord(String paragraph, String[] banned) {

        String paragraphLowerCase = paragraph.toLowerCase();

        HashMap<String, Integer> wordsFreq = new HashMap<>();

        List<String> words = new ArrayList<>(Arrays.asList(paragraphLowerCase.split("[!?',;.]|\\s+")));

        for (int i = 0; i < words.size(); i++) {

            for (int j = 0; j < banned.length; j++) {
                if (words.get(i).equals(banned[j])) {
                    words.remove(i);
                } else {
                    continue;
                }
            }
        }

        // for(String x : words){

        // if(x.equals(" ")){
        // words.remove(x);
        // }
        // }
        // System.out.println(words.size());

        for (String w : words) {

            if (!wordsFreq.containsKey(w)) {
                wordsFreq.put(w, 1);
            } else {
                int freq = wordsFreq.get(w);
                freq++;
                wordsFreq.put(w, freq);
            }
        }

        int maxFreq = 0;
        String maxValeuKey = "";

        for (Map.Entry<String, Integer> entry : wordsFreq.entrySet()) {
            String currentKey = entry.getKey();
            int currentValue = entry.getValue();

            if (currentValue > maxFreq) {
                maxFreq = currentValue;
                maxValeuKey = currentKey;
            }
        }

        return maxValeuKey;
    }
}
