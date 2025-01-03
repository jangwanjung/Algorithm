import java.io.*;
import java.util.*;

public class Main {

    static int [] nums;
    static boolean [] visited;
    static int [] arr;
    static int n;
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new int[n];
        visited = new boolean[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(0);

        System.out.println(result);


    }
    public static void backtracking(int depth) {
        if (depth == n) {
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum += Math.abs(arr[i]-arr[i+1]);
            }
            result = Math.max(result,sum );
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = nums[i];
                backtracking(depth+1);
                visited[i] = false;
            }
        }

    }

}