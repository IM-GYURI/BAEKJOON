import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(true) {
            String s = br.readLine();

            if (s.equals("=")) {
                break;
            }

            switch (s) {
                case "+" :
                    n += Integer.parseInt(br.readLine());
                    break;
                case "-" :
                    n -= Integer.parseInt(br.readLine());
                    break;
                case "*" :
                    n *= Integer.parseInt(br.readLine());
                    break;
                case "/" :
                    n /= Integer.parseInt(br.readLine());
                    break;
                default:
                    break;
            }
        }
        System.out.println(n);
        br.close();
    }
}
