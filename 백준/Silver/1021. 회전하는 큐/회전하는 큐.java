import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		Deque<Integer>deque=new ArrayDeque<Integer>();
		for(int i=1;i<=n;i++) {
			deque.add(i);
		}
		int count=0;
		for(int i=0;i<m;i++) {
			int p=0;
			int q=Integer.parseInt(st.nextToken());
			for(int j:deque) {
				if(j==q) {
					break;
				}
				p++;
			}
			int len=deque.size()/2;
			if(p<=len) {
				while(true) {
					if(deque.peekFirst()==q) {
						deque.removeFirst();
						break;
					}
					deque.add(deque.pollFirst());
					count++;
				}
			}
			else {
				while(true) {
					if(deque.peekLast()==q) {
						deque.removeLast();
						count++;
						break;
					}
					deque.addFirst(deque.pollLast());
					count++;
				}
			}
		}
		System.out.println(count);
	}
}