import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cycle = Integer.parseInt(br.readLine());
        
        for(int k = 0; k <cycle; k++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            
            int time = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            String[] spell = word.split("");
            
            for(int i = 0; i < spell.length; i++){
                for(int j = 0; j <  time; j++){
                    bw.write(spell[i]);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}