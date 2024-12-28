import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            String before = "";
            String now;
            int score = 0;
            int totalScore = 0;

            for(int j = 0; j < input.length(); j++){
                now = String.valueOf(input.charAt(j));
                    if(now.equals("O")){
                        score++;
                    }
                    else{
                        score = 0;
                    }
                    totalScore += score;
                    before = now;
            }
            bw.write(totalScore+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}