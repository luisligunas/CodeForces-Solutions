import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class CF630F {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		pw.println(ans(Long.parseLong(br.readLine())));
		
		pw.close();
		
	}
	
	public static long ans(long n) {
		long total = 0;
		for(long i = 5; i <= 7; i++) {
			total += nCr(n, i);
		}
		return total;
	}
	
	public static long nCr(long n, long k) {
		BigInteger prod = BigInteger.ONE;
		
		for(long b = k+1; b <= n; b++) {
			prod = prod.multiply(new BigInteger(b + ""));
		}
		for(long i = 2; i <= n-k; i++) {
			prod = prod.divide(new BigInteger(i + ""));
		}
		return prod.longValue();
	}
}