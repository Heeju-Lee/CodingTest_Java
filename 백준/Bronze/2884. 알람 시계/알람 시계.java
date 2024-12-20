import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        // 45분 일찍 설정
        min -= 45;
        if (min < 0) {
            min += 60;
            hour--;
            if (hour < 0) {
                hour = 23;
            }
        }

        System.out.println(hour + " " + min);
        br.close();
    }
}