import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String sentence = br.readLine().trim();
        String[] words = sentence.split(" ");

        if(sentence.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(words.length);
        }
        br.close();
    }
}