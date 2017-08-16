import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class CF131C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		long n = Long.parseLong(split[0]);
		long m = Long.parseLong(split[1]);
		long t = Long.parseLong(split[2]);
		
		BigInteger total = BigInteger.ZERO;
		long min = Math.min(n, t-1);
		for(int i = 4; i <= min; i++) {
			total = total.add(  nCr(n, n-i).multiply(nCr(m, m-(t-i))))  ;
		}
		pw.println(total);
		pw.close();
	}
	
	public static BigInteger nCr(long n, long k) {
		BigInteger prod = BigInteger.ONE;
		
		for(long b = k+1; b <= n; b++) {
			prod = prod.multiply(new BigInteger(b + ""));
		}
		for(long i = 2; i <= n-k; i++) {
			prod = prod.divide(new BigInteger(i + ""));
		}
		return prod;
	}
}