import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = n/4;

        for (int i = 0; i < x; i++){
            System.out.print("long ");
        }

        System.out.print("int");
        br.close();
    }
}