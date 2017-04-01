import java.io.*;

public class CF626B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static boolean[] oks = new boolean[3];
	static boolean[][][] dp = new boolean[201][201][201];
	
	public static void main(String[] args) throws IOException {
		br.readLine();
		
		String string = br.readLine();
		int r = 0, g = 0, b = 0;
		
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'R') r++;
			else if(string.charAt(i) == 'G') g++;
			else b++;
		}
		recurse(r, g, b);
		if(oks[0]) pw.print('B');
		if(oks[1]) pw.print('G');
		if(oks[2]) pw.print('R');
		pw.println();
		
		pw.close();
	}
	public static void recurse(int r, int g, int b) {
		
		if(dp[r][g][b]) return;
		dp[r][g][b] = true;
		if(r + g + b == 1) {
			if(r == 1) oks[2] = true;
			else if(g == 1) oks[1] = true;
			else oks[0] = true;
			return;
		}
		
		if(r > 0 && g > 0) recurse(r - 1, g - 1, b + 1);
		if(r > 0 && b > 0) recurse(r - 1, g + 1, b - 1);
		if(b > 0 && g > 0) recurse(r + 1, g - 1, b - 1);
		if(r > 1) recurse(r - 1, g, b);
		if(g > 1) recurse(r, g - 1, b);
		if(b > 1) recurse(r, g, b - 1);
	}
}