import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        String[] spelling = word.split("");

        int i = Integer.parseInt(br.readLine());

        System.out.println(spelling[i-1]);

    }
}