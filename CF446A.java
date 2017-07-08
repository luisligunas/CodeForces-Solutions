import java.io.*;
import java.util.*;

public class CF446A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		int[] nums = new int[n];
		String[] split = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(split[i]);
		}
		
		if(n <= 2 || isIncreasing(nums)) {
			pw.println(n);
			pw.close();
			return;
		}
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		a[n-1] = 1;
		b[0] = 1;
		
		for(int i = n - 2; i >= 0; i--) {
			if(nums[i] < nums[i+1])
				a[i] = a[i+1] + 1;
			else
				a[i] = 1;
		}
		
		for(int i = 1; i < n; i++) {
			if(nums[i] > nums[i-1])
				b[i] = b[i-1] + 1;
			else
				b[i] = 1;
		}
		//all reference arrays are now set
		
		int min = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			min = Math.max(min, b[i] + 1);
			min = Math.max(min, a[nums.length - i - 1] + 1);
		}
		//min is the minimum possible value that should be returned. No future found value should be lower
		//not sure if useless^^
		
		for(int i = 1; i < nums.length - 1; i++) {
			if(a[i] == 1 || b[i] == 1) {
				if(nums[i-1] + 2 <= nums[i+1])
					min = Math.max(min, b[i-1] + a[i+1] + 1);
			}
		}
		
		pw.println(min);
		
		pw.close();
	}
	public static boolean isIncreasing(int[] a) {
		for(int i = 1; i < a.length; i++) {
			if(a[i] <= a[i-1]) return false;
		}
		return true;
	}
}
