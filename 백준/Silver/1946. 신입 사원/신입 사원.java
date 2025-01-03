import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int [][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));  //두번째 열을 기준으로 정렬
            int result = n;
            int min = arr[0][0];
            for (int j = 1; j < n; j++) {
                if (arr[j][0] > min) {
                    result--;
                } else if (arr[j][0] < min) {
                    min = arr[j][0];
                }
            }
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);

    }

}