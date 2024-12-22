import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[9];
        int max = 0;
        int row = 0;

        for(int i = 0; i < 9; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            if(numbers[i] > max) {
                max = numbers[i];
                row = i + 1;
            }
        }
        System.out.println(max+"\n"+row);
    }
}