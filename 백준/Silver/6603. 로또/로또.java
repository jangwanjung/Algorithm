import java.io.*;
import java.util.*;

public class Main {
    static int [] arr;
    static int [] nums;
    static boolean [] visited;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0) break;

            arr = new int[6];
            visited = new boolean[n];
            nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(st.nextToken());
            }
            backtracking(0,6,0);
            System.out.println();
        }



    }
    public static void backtracking(int depth, int len,int k){
        if(depth == len){
            for (int data : arr){
                System.out.print(data+" ");
            }
            System.out.println();
            return;
        }
        for (int i = k; i < n; i++){
            arr[depth] = nums[i];
            backtracking(depth+1,len,i+1);
        }
    }
}