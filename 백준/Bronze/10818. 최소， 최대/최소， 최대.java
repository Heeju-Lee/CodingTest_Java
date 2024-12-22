import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList();

        for(int i = 0; i<n; i++){
            list.add(Integer.valueOf(st.nextToken()));
        }
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int min = list.stream().min(Integer::compareTo).orElse(0);

        System.out.println(min+" "+max);
        br.close();
    }
}