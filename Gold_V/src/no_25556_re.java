import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class no_25556_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push(0);
        }

        for (int i = 0; i < N; i++) {
            boolean flag = false;
            for (int j = 0; j < stacks.length; j++) {
                if (stacks[j].peek() < A[i]) {
                    stacks[j].push(A[i]);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
