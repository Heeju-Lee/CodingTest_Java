import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String space = " ";
        String star = "*";

        for (int i = 1; i <= t; i++) {
            System.out.println((space.repeat(t - i)) + (star.repeat(i)));
        }
    }
}
