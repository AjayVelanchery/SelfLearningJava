package December.Fintrens;

import java.util.*;

public class StringTaskFintrens {


    public static void main(String[] args) {

        String[] words = {
                "ajay vijay sanjay ajay",
                "raju shamu gopu",
                "raju ajay vijay "
        };


        List<Map.Entry<String, Integer>> sorted = processAndSort(words);

        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static List<String> getAllWords(String[] inputStrings) {
        List<String> words = new ArrayList<>();
        for (String line : inputStrings) {

            words.addAll(Arrays.asList(line.toLowerCase().split("\\s+")));
        }
        return words;
    }

    private static Map<String, Integer> countWordFrequency(List<String> words){


         Map<String,Integer> freqMap =new HashMap<>();
         for (String word : words) {

             freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
         }
         return freqMap;

     }
    private static List<Map.Entry<String, Integer>> sortByFrequency(Map<String, Integer> freqMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        return list;
    }

    public static List<Map.Entry<String, Integer>> processAndSort(String[] input) {
        List<String> words = getAllWords(input);
        Map<String, Integer> freqMap = countWordFrequency(words);
        return sortByFrequency(freqMap);
    }
}
