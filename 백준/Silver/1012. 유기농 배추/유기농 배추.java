import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main{
	static boolean field[][];
	static boolean visit[][];
	static int dx[]= {0,0,1,-1};
	static int dy[]= {-1,1,0,0};
	static int x;
	static int y;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			field=new boolean[x][y];
			visit=new boolean[x][y];
			for(int j=0;j<b;j++) {
				st=new StringTokenizer(br.readLine());
				field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=true;
				
			}
			int count=0;
			for(int n=0;n<x;n++) {
				for(int m=0;m<y;m++) {
					if(field[n][m]&&!visit[n][m]) {
						DFS(n,m);
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
		
	}

	private static void DFS(int q, int w) {
		visit[q][w]=true;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int nx=q+dx[i];
				int ny=w+dy[i];
				if(nx>=0&&ny>=0&&nx<x&&ny<y) {
					if(field[nx][ny]&&!visit[nx][ny]) {
						DFS(nx,ny);
					}
				}
			}
		}
		
	}	
}