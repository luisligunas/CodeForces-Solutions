import java.io.*;
import java.util.*;

public class CF706C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static boolean[][][] before;
	static long[] c;
	static long[][] dp;
	static boolean goods = false;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		c = new long[n];
		
		String[] split = br.readLine().split(" ");
		for(int i = 0; i < c.length; i++)
			c[i] = Long.parseLong(split[i]);
		
		before = new boolean[n-1][2][2];
		dp = new long[n][2];
		
		for(int i = 0; i < n; i++) {
			dp[i][0] = -234;
			dp[i][1] = -234;
		}
		
		String prev = br.readLine();
		String verp = rev(prev);
		
		for(int i = 1; i < c.length; i++) {
			String curr = br.readLine();
			String rruc = rev(curr);
			
			if(prev.compareTo(curr) <= 0)
				before[i-1][0][0] = true;
			if(prev.compareTo(rruc) <= 0)
				before[i-1][0][1] = true;
			if(verp.compareTo(curr) <= 0)
				before[i-1][1][0] = true;
			if(verp.compareTo(rruc) <= 0)
				before[i-1][1][1] = true;
			
			prev = curr;
			verp = rruc;
		}
		
		//input done
		long val = Math.min(dpMet(0, 0), dpMet(0, 1) + c[0]);
		
		if(!goods)
			pw.println(-1);
		else
			pw.println(val);
		
		pw.close();
	}

	public static long dpMet(int ind, int tB) {//topBottom: 0 or 1
		if(ind >= c.length - 1) {
			goods = true;
			return 0;
		}
		
		if(dp[ind][tB] != -234)
			return dp[ind][tB];
		
		long a = 1000000000000000L, b = 1000000000000000L;
		
		if(before[ind][tB][0])
			a = Math.min(a, dpMet(ind + 1, 0));
		
		if(before[ind][tB][1])
			b = Math.min(b, dpMet(ind + 1, 1) + c[ind + 1]);
		
		dp[ind][tB] = Math.min(a, b);
		return dp[ind][tB];
	}
	
	public static String rev(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--)
			sb.append(s.charAt(i));
		
		return sb.toString();
	}
}
