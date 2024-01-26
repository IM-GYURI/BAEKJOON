import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] names = new int[N];
        int[] count = new int[20];  // 1 <= N <= 1,000,000 인데 2진법으로 하면 1,000,000은 20자리 이하
        long sum =0;

        // 모든 주민 이름 담기
        for (int i = 0; i < N; i++) {
            names[i] = Integer.parseInt(br.readLine());
        }

        // 각 자리수의 1의 개수 세기
        for (int i = 0; i < N; i++) {
            int name = names[i];
            int idx = 0;
            while (name > 0) {
                count[idx++] += name % 2;   // count[0]부터 idx를 1씩 증가시키며 비트가 1인 경우 1씩 저장
                name /= 2;  // 비트에 저장한 값만큼 뺀 것과 동일
            }
        }

        // 행성 가치 구하기
        for (int i = 19; i >= 0; i--) {
            sum += (long) count[i] * (N - count[i]);    // 비트가 1인 경우 * 비트가 0인 경우
            sum <<= 1;  // sum에 2를 곱한 것과 같은 효과
        }
        sum >>= 1;  // 마지막은 2를 안 곱해도 괜찮은데 for문의 마지막에 곱했으므로 2로 나누기
        System.out.println(sum);
    }
}
