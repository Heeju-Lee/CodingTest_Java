import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[n];
        double max = 0 ;

        for(int i = 0 ; i < n ; i++) {
            scores[i] = Double.parseDouble(st.nextToken());

            if(scores[i] > max) {
                max = scores[i];
            }
        }

        for(int i = 0 ; i < n ; i++) {
            scores[i] = (scores[i]/max)*100;
        }

        double average = Arrays.stream(scores).average().getAsDouble();
        System.out.println(average);
    }
}