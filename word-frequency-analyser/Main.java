import java.util.*;

public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        String inputText = "This is a test. This is only a test.";
        List<Map.Entry<String, Integer>> sortedWords = wordFrequencyAnalyzer(inputText);
        System.out.println(sortedWords);
    }

    public static List<Map.Entry<String, Integer>> wordFrequencyAnalyzer(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(frequencyMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        return sortedWords;
    }
}