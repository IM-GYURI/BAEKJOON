import java.io.*;
import java.util.*;

public class no_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            String scan = br.readLine();
            String[] num = scan.split(" ");
            int[] arr = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
            nums[i] = arr[0] + arr[1];
        }

        for (int result : nums) {
            System.out.println(result);
        }
    }
}