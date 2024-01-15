import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class no_25556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 비교를 위해 가장 작은 수를 각 스택에 삽입
        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push(0);
        }

        // 스택의 peek보다 큰 수라면 삽입
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < stacks.length; j++) {
                if (stacks[j].peek() < arr[i]) {
                    stacks[j].push(arr[i]);
                    flag = true;
                    break;
                }
            }

            // 모든 스택에 삽입하지 못했다면
            if (!flag) {
                System.out.println("NO");
                return;
            }
        }

        // 순열 청소 완료
        System.out.println("YES");
    }
}