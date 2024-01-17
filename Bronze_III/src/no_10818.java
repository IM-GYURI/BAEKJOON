import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class no_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int[] numArr = new int[N];
        numArr = Stream.of(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
