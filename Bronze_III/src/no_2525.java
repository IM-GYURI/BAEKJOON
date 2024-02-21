import java.util.Scanner;

public class no_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        if ((m + cook) >= 60) {
            h += (m + cook) / 60;
            m = (m + cook) % 60;
            if (h >= 24) {
                h -= 24;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m + cook));
        }
    }
}
