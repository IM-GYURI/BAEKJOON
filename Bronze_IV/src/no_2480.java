import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] num = new int[3];
        int idx = 0;
        for (String n : s.split(" ")) {
            num[idx++] = Integer.parseInt(n);
        }

        if (num[0] == num[1] && num[0] == num[2]) {
            System.out.println(10000 + num[0] * 1000);
        } else if (num[0] == num[1] && num[0] != num[2] || num[0] == num[2] && num[0] != num[1]) {
            System.out.println(1000 + num[0] * 100);
        } else if (num[1] == num[2] && num[0] != num[1]) {
            System.out.println(1000 + num[1] * 100);
        } else {
            int max = num[0];
            for (int i = 1; i < num.length; i++) {
                if (max < num[i]) {
                    max = num[i];
                }
            }
            System.out.println(max * 100);
        }
    }
}
