import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String[] nums = num.split(" ");
        long total = 0;

        for(int i=0; i<nums.length; i++){
            long num1 = Long.parseLong(nums[i]);
            total += num1;
        }
        System.out.println(total);
    }
}