import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] result = str.split("");

        String result1 = result[0];
        String result2 = "";
        if (result.length > 1) {
            result2 = result[1];
        }

        double score = 0;

        switch (result1){
            case "A": score=4.0; break;
            case "B": score=3.0; break;
            case "C": score=2.0; break;
            case "D": score=1.0; break;
            case "F": score=0.0; break;
        }

        if(result2.equals("+")) score += 0.3;
        else if (result2.equals("-")) score -= 0.3;
        else score += 0;

        System.out.println(score);
        br.close();
    }
}





