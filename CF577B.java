import java.io.*;
import java.util.*;

public class CF577B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static boolean[][] dp;
	static int[] a;
	static boolean goods = false;
	static int m;
	
	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		
		if(n > m) {
			System.out.println("YES");
			return;
		}
		a = new int[n];
		dp = new boolean[m][m];
		split = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(split[i]) % m;
		}
		
		idk(0, 0, true);
		if(goods) pw.println("YES");
		else pw.println("NO");
		
		pw.close();
	}
	
	public static void idk(int ind, int mod, boolean jux) {
		if(goods) return;
		
		if(ind == a.length) return;
		if(mod == 0 && !jux) {
			goods = true;
			return;
		}
		if(dp[ind][mod])
			return;
		dp[ind][mod] = true;
		
		if((mod + a[ind]) % m == 0) {
			goods = true;
			return;
		}
		idk(ind + 1,(mod + a[ind]) % m, false);
		idk(ind + 1, mod, jux);
	}
}
