import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m  = st.nextToken();

        String[] n1 = n.split("");
        String[] m1 = m.split("");

        for(int i = n1.length-1; i >= 0; i--){
            sb1.append(n1[i]);
        }
        for(int j = m1.length-1; j >= 0; j--){
            sb2.append(m1[j]);
        }

        int n2 = Integer.parseInt(sb1.toString());
        int m2 = Integer.parseInt(sb2.toString());

        bw.write(String.valueOf(Math.max(n2, m2)));
        bw.flush();
        bw.close();
        br.close();
    }
}