import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st1.nextToken());
        int min = Integer.parseInt(st1.nextToken());

        int spendTime = Integer.parseInt(br.readLine());
        min += spendTime;

        if(min>=60) {
            hour += min/60;
            min %= 60;
        }

        hour = hour%24;

        System.out.println(hour + " " + min);
        br.close();
    }
}