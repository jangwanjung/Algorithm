import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++) {
        	int x=Integer.parseInt(br.readLine());
        	if(x==0) {
        		System.out.println("1 0");
        	}
        	else {
        		
        	
        	int dp0[]=new int[x+1];
        	int dp1[]=new int[x+1];
        	dp0[0]=1;
        	dp1[0]=0;
        	dp0[1]=0;
        	dp1[1]=1;
        	for(int j=2;j<=x;j++) {
        		dp0[j]=dp0[j-1]+dp0[j-2];
        		dp1[j]=dp1[j-1]+dp1[j-2];
        	}
        	System.out.println(dp0[x]+" "+dp1[x]);
        	}       	
        }

    }
}