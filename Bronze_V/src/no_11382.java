import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] num = new long[3];
        String s = br.readLine();
        int idx = 0;
        for (String n : s.split(" ")) {
            num[idx++] = Long.parseLong(n);
        }

        System.out.println(num[0] + num[1] + num[2]);
    }
}
