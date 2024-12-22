import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int temp = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        // m번 바꾼다.
        for(int x = 0 ; x<m; x++){
            //공을 어떻게 바꿀지
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // i공은 j에 j공은 i에
            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        for(int z = 0 ; z<arr.length; z++) {
            bw.write(arr[z]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}