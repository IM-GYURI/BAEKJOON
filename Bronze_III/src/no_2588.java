import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int n3 = a * (b % 10);
        b /= 10;
        int n4 = a * (b % 10);
        b /= 10;
        int n5 = a * (b);
        int n6 = n3 + n4 * 10 + n5 * 100;

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
