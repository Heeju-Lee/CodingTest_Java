import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int temp = 0;
        if (k == 1) {
            bw.write("0");
        } else {
            temp = 1-k;
            bw.write(String.valueOf(temp));
        }
        bw.write(" ");
        if (q == 1) {
            bw.write("0");
        } else {
            temp = 1-q;
            bw.write(String.valueOf(temp));
        }
        bw.write(" ");
        if (l == 2) {
            bw.write("0");
        } else {
            temp = 2-l;
            bw.write(String.valueOf(temp));
        }
        bw.write(" ");
        if (b == 2) {
            bw.write("0");
        } else {
            temp = 2-b;
            bw.write(String.valueOf(temp));
        }
        bw.write(" ");
        if (n == 2) {
            bw.write("0");
        } else {
            temp = 2-n;
            bw.write(String.valueOf(temp));
        }
        bw.write(" ");
        if (p == 8) {
            bw.write("0");
        } else {
            temp = 8-p;
            bw.write(String.valueOf(temp));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}