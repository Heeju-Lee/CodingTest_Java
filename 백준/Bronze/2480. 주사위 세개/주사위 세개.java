import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int reward;


        if(x==y && y==z) reward=10000+x*1000;
        else if(x==y || x==z) reward=1000+x*100;
        else if(y==z) reward=1000+y*100;
        else {
            int maxValue = Math.max(x, Math.max(y, z));
            reward=maxValue*100;
        }

        System.out.println(reward);
        br.close();
    }
}