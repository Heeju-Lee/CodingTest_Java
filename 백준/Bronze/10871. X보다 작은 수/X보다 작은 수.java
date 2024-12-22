import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] input = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            input[i] = Integer.parseInt(st.nextToken());
            if(input[i] < x){
                bw.write(input[i] + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}