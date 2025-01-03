import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String[] spelling = input.split("");

            int max = spelling.length - 1;

            bw.write(spelling[0]);
            bw.write(spelling[max]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}