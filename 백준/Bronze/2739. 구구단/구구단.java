import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            String times = String.valueOf(num * i);
            bw.write(num + " * " + i + " = " + times+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}