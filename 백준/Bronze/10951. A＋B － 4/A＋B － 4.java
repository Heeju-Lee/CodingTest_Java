import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        String input = "";

        while((input= br.readLine()) != null){
            if (input.trim().isEmpty()) {  // 빈 줄을 건너뛰기 위해
                break;
            }

            String[] numbers = input.split(" ");
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);

            sb.append(x+y).append("\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}