import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //단어입력
        String input = br.readLine().toUpperCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //defalutValue>> c가 없으면  0 있으면 +1
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxFrequency = 0;
        boolean isDuplicate = false;

        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFrequency) {
                maxFrequency = freq;
                mostFrequentChar = ch;
                isDuplicate = false;
            } else if (freq == maxFrequency) {
                isDuplicate = true;
            }
        }
        if(isDuplicate) {
            mostFrequentChar = '?';
            System.out.println(mostFrequentChar);
        }else System.out.println(mostFrequentChar);

        br.close();
    }
}