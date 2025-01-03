import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        for (int i = 1; i < n; i++) {
            arr[i][0] = arr[i-1][1] + arr[i-1][2] + arr[i-1][0];
            arr[i][1] = arr[i-1][0] + arr[i-1][2];
            arr[i][2] = arr[i-1][0] + arr[i-1][1];
            arr[i][0]%=9901;
            arr[i][1]%=9901;
            arr[i][2]%=9901;
        }
        int result = Arrays.stream(arr[n-1]).sum();
        System.out.println(result%9901);

    }
}