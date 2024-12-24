import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[1000];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int first = num/100;
            int second = (num/10)%10;
            int third = (num%100)%10;
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10 ; k++) {
                    for (int l = 1; l < 10 ; l++) {
                        if(j==k || j==l || k==l){
                            continue;
                        }

                        int a = j*100+k*10+l;
                        if(arr[a]==-1){
                            break;
                        }
                        int firstNum = j;
                        int secondNum = k;
                        int thirdNum = l;
                        int strikeCount = 0;
                        int ballCount = 0;
                        //스트라이크 체크
                        if(firstNum == first){
                            strikeCount++;
                        }
                        else if(first == secondNum || first == thirdNum){
                            ballCount++;
                        }
                        if(secondNum == second){
                            strikeCount++;
                        }
                        else if(second == firstNum || second == thirdNum){
                            ballCount++;
                        }
                        if(thirdNum == third){
                            strikeCount++;
                        }
                        else if(third == firstNum || third == secondNum){
                            ballCount++;
                        }
                        //볼 체크
                        if (strikeCount == strike && ballCount == ball) {
                            arr[a]++;
                        }
                    }
                }

            }

        }
        int result=0;
        for(int i = 100; i < 1000; i++){
            if(arr[i]==n){
                result++;
            }
        }
        System.out.println(result);
    }

}