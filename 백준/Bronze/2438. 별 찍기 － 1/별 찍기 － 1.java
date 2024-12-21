import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 0; i < n; i++) {
            System.out.println(star);
            star += "*";
        }
        br.close();
    }
}