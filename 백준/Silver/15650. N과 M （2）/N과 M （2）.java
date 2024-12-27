import java.io.*;
import java.util.*;

public class Main{
	static int arr[];
	static boolean visit[];
	static int a,b;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		arr=new int[b];
		visit=new boolean[a+1];
		sb=new StringBuilder();
		DFS(1,0);
		System.out.println(sb);
		
		
	}
	private static void DFS(int k,int depth) {
		if(depth==b) {
			for(int date:arr) {
				sb.append(date+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=k;i<=a;i++) {
			
			arr[depth]=i;
			DFS(i+1,depth+1);
				
				

			
		}
		
	}
}