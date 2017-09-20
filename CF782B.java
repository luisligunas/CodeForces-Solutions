import java.io.*;
import java.util.*;
 
public class CF782B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int[] x, v;
	
	public static void main(String[] args) throws IOException {
		br.readLine();
		String[] split = br.readLine().split(" ");
		x = new int[split.length];
		
		for(int i = 0; i < x.length; i++)
			x[i] = Integer.parseInt(split[i]);
		
		split = br.readLine().split(" ");
		v = new int[split.length];
		
		for(int i = 0; i < v.length; i++)
			v[i] = Integer.parseInt(split[i]);
		
		double left = 0, right = 1000000001;
		double leftDist = getTime(left), rightDist = getTime(right);
		final double eps = 0.0000005;
		
		while(right - left >= eps) {
			double mid = (left + right)/2;
			
			double midDist = getTime(mid);
			double plus1Dist = getTime(mid + 0.0000001);
			
			if(midDist < plus1Dist)
				right = mid;
			else 
				left = mid;
		}
		
		pw.println(getTime(right));
		
		pw.close();
	}
	
	public static double getTime(double dist) {
		double max = -1;
		for(int i = 0; i < x.length; i++) {
			max = Math.max(max, Math.abs(x[i]-dist)/v[i]);
		}
		return max;
	}
}
