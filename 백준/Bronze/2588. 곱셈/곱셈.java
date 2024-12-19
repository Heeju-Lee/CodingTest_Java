import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //y배열 숫자 뽑기
        String[] str = String.valueOf(y).split("");

        for(int i = str.length - 1; i>=0; i--){{
            int z = Integer.parseInt(str[i]);
            System.out.println(x*z);
        }}
        System.out.println(x*y);
    }
}