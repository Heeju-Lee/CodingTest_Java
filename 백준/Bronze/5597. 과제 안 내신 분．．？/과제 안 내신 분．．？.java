import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        for(int i = 0; i < arr.length-2; i++){
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = n;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int j = i+1;
                bw.write(j+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}