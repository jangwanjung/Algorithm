import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //빙고채우기
       int [][] arr = new int[5][5];
       for (int i = 0 ; i < 5 ; i++){
           String st = br.readLine();
           String [] numbers = st.split(" ");
           for (int j = 0 ; j < 5 ; j++){
               arr[i][j] = Integer.parseInt(numbers[j]);
           }
       }

       int result = 0;
       for (int i = 0 ; i < 5 ; i++){
           String st = br.readLine();
           String [] numbers = st.split(" ");
           for (int j = 0 ; j < 5 ; j++){
               int number = Integer.parseInt(numbers[j]); //숫자하나뽑기
               result+=1;
               q:for (int k = 0 ; k < 5 ; k++){
                   for (int l = 0 ; l < 5 ; l++){
                       if (arr[k][l] == number){
                           arr[k][l] = 0;  //나온숫자에 0넣기
                           int cnt = 0;
                           //가로줄 검사
                           p:for (int m = 0 ; m < 5 ; m++){
                               for (int n = 0 ; n < 5 ; n++){
                                   if (arr[m][n]!=0){
                                       continue p;
                                   }
                               }
                               cnt+=1;
                           }
                           //세로줄검사
                           p:for (int m = 0 ; m < 5 ; m++){
                               for (int n = 0 ; n < 5 ; n++){
                                   if (arr[n][m]!=0){
                                       continue p;
                                   }
                               }
                               cnt+=1;
                           }
                           //대각선줄검사
                           int a = 0;
                           for (int m = 0 ; m < 5 ; m++){
                               if(arr[m][m]!=0){
                                   break;
                               }
                               a+=1;
                           }
                           if (a==5){
                               cnt+=1;
                           }
                           a = 0;
                           for (int m = 0 ; m < 5 ; m++){
                               if(arr[m][4-m]!=0){
                                   break;
                               }
                               a+=1;
                           }
                           if (a==5){
                               cnt+=1;
                           }
                           if (cnt>=3){
                               System.out.println(result);
                               System.exit(0);
                           }
                           break q;
                       }
                   }
               }
           }

       }

    }

}