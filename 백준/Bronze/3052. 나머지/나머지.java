import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> arr = new HashSet<Integer>();

        for(int i = 0; i<10; i++){
            arr.add(Integer.valueOf(br.readLine())%42);
        }

        System.out.println(arr.stream().count());
        br.close();
    }
}