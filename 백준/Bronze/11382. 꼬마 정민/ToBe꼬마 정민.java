import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 한 줄 입력받기

        long sum = Arrays.stream(input.split(" ")) // 입력 문자열을 공백으로 분리
                .mapToLong(Long::parseLong) // 각 값을 long으로 변환
                .sum(); // 합계 계산

        System.out.println(sum); // 결과 출력
    }
}
