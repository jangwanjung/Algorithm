    import java.io.*;
    import java.util.*;

    public class Main {
        static int n;
        static int [] arr;
        static int [] nums;
        static boolean [] visited;
        static int result;
        static int sum;

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            sum = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            arr = new int[n];
            nums = new int[n];
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i] = 100001;
            }
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
                backtracking(0,i,0);
            }
            System.out.println(result);
        }
        public static void backtracking(int depth, int len,int p) {
            if (len==depth) {
                sumCheck();
            }
            else{
                for (int i=p; i<n ;i++){
                    if(!visited[i]){
                        arr[depth] = nums[i];
                        visited[i] = true;
                        backtracking(depth+1,len,i+1);
                        visited[i] = false;
                    }
                }
            }
        }
        public static void sumCheck() {
            int cnt=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=100001){
                    cnt+=arr[i];
                }
            }
            if(cnt==sum){
                result+=1;
            }
        }
    }