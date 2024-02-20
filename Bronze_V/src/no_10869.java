import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] num = new int[2];
        int idx = 0;
        for (String n : s.split(" ")) {
            num[idx++] = Integer.parseInt(n);
        }

        System.out.println(num[0] + num[1]);
        System.out.println(num[0] - num[1]);
        System.out.println(num[0] * num[1]);
        System.out.println(num[0] / num[1]);
        System.out.println(num[0] % num[1]);
    }
}
