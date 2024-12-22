import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        // m번만큼 공넣기
        for(int x = 0 ; x<m; x++){
            //공을 어떻게 넣을지
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // i ~ j 까지 k 공을 넣음
            for(int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }
        for(int z = 0 ; z<arr.length; z++) {
            bw.write(arr[z]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}