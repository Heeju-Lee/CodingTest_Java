import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long total = Long.parseLong(br.readLine());
        int lines = Integer.parseInt(br.readLine());
        long sum = 0;

        for(int i = 0; i < lines; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long price = Long.parseLong(st.nextToken());
            long quantity = Long.parseLong(st.nextToken());

            sum += price * quantity;
        }

        if(sum == total){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        br.close();
    }
}