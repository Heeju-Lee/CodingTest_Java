import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i =0; i < length /2 ; i++) {
            if(input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? 1 : 0);
;
        br.close();
    }
}