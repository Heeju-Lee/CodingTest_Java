import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //주어진 n개의 정수
        int n = Integer.parseInt(br.readLine());
        //int 배열
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //빈도수를 찾을 정수 v
        int v = Integer.parseInt(br.readLine());
        //정수 v의 frequency
        int f = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == v) f++;
        }
        System.out.println(f);
        br.close();
    }
}





