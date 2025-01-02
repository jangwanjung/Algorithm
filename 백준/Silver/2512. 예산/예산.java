import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(ls);
        for (int i = 0; i < n; i++) {
            arr[i] = ls.get(i);
        }
        int sum = Integer.parseInt(br.readLine());

        int mid = 0;
        int left = 0;
        int right = arr[n-1];
        int result = -1;
        while (left <= right) {
            mid = (left + right)/2;
            int hap = 0;
            for(int i=0;i<n;i++){
                if(arr[i]>=mid){
                    hap+=mid;
                }
                else hap+=arr[i];
            }
            if (hap > sum) {
                right = mid-1;
            } else if (hap <= sum) {
                left = mid+1;
                result = Math.max(result, mid);
            }


        }
        System.out.println(result);

    }

}