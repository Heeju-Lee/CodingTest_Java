import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //총합
        double total = 0;
        //평균
        double average = 0;
        //학점
        double score = 0;
        double totalScore = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String object = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double point = 0;

            switch (grade) {
                case "P":
                    continue;
                case "F":
                    point = 0.0;
                    break;
                case "A+":
                    point = 4.5;
                    break;
                case "A0":
                    point = 4.0;
                    break;
                case "B+":
                    point = 3.5;
                    break;
                case "B0":
                    point = 3.0;
                    break;
                case "C+":
                    point = 2.5;
                    break;
                case "C0":
                    point = 2.0;
                    break;
                case "D+":
                    point = 1.5;
                    break;
                case "D0":
                    point = 1.0;
            }
            total += score * point;
            totalScore += score;
        }
        average = total / totalScore;

        System.out.printf("%.6f\n", average);

        br.close();
    }
}