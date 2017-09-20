import java.io.*;
import java.util.*;
 
public class CF772A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static long[] a, b;
	
	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		long p = Integer.parseInt(split[1]);
		double p2 = p;
		
		a = new long[n];
		b = new long[n];
		
		long sumA = 0;
		for(int i = 0; i < n; i++) {
			split = br.readLine().split(" ");
			a[i] = Integer.parseInt(split[0]);
			sumA += a[i];
			b[i] = Integer.parseInt(split[1]);
		}
		
		if(p >= sumA) {
			System.out.println(-1);
			return;
		}
		
		double left = 0, right = 100000000000000L;
		final double eps = 0.00000001;
		
		for(int i = 0; right - left >= eps && i < 100; i++) {
			double mid = (left + right)/2;
			
			double midPower = powerRequired(mid);
			
			if(midPower > p2*mid)
				right = mid;
			else
				left = mid;
		}
		
		pw.println(left);
		
		pw.close();
	}
	
	public static double powerRequired(double time) {
		double total = 0;
		
		long sumA = 0, sumB = 0;
		for(int i = 0; i < a.length; i++) {
			if(Double.compare(b[i], time*a[i]) <= 0) {
				sumA += a[i];
				sumB += b[i];
			}
				
		}
		return sumA*time - sumB;
	}
}
