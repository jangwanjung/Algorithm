import java.util.Scanner;

import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.io.*;

public class Main {
	
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a;
			for(int j=1;j<b;j++) {
				c*=a;
				c%=10;
				
				
			}
			c%=10;
			if(c==0) {
				System.out.println(10);
			}
			else {
				System.out.println(c);
			}
			
		}
	
		
	}
}