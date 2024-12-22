import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //n개의 바구니 역순으로 m번 바꿀 것.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int baskets[] = new int[n];
        int temp;

        //먼저 바구니에 번호
        for(int x = 0 ; x < n ; x++) {
            baskets[x] = x+1;
        }

        for(int y = 0 ; y < m ; y++) {
            // i번째 바구니부터 j번째의 바구니의 순서를 역순으로
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int a = i-1;
            int b = j-1;

            for(int z = a ; z < b; z++){
                temp = baskets[z];
                baskets[z] = baskets[b];
                baskets[b] = temp;
                b--;
            }
        }
        br.close();
        for(int i=0;i<baskets.length;i++) {
            System.out.print(baskets[i]+" ");
        }
    }
}