import java.util.Scanner;

public class no_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            h = h - 1;
            if (h < 0) {
                h = 23;
            }
            m = m + 60 - 45;
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
