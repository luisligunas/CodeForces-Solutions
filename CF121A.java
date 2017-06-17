import java.io.*;
import java.util.*;

public class CF121A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main (String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		long l = Long.parseLong(split[0]);
		long r = Long.parseLong(split[1]);
		long sum = 0;
		
		while(l <= r) {
			long next = next(l);
			if(next > r) sum += (r - l + 1)*next;
			else sum += (next - l + 1)*next;
			
			l = next + 1;
		}
		
		pw.println(sum);
		
		pw.close();
	}
	public static long next(long num) {
		long[] array = new long[(num + "").length() + 1];
		
		for(int i = 1; i < array.length; i++) {
			array[i] = (num/(long)Math.pow(10, array.length - i - 1)) % 10;
		}
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] == 4 || array[i] == 7) continue;
			if(array[i] < 4) {
				for(; i < array.length; i++) {
					array[i] = 4;
				}
				break;
			}
			if(array[i] > 7) {
				array[i-1]++;
				array[i] = 0;
				i -= 2;
			}
			else {
				array[i] = 7;
				i++;
				for(; i < array.length; i++) {
					array[i] = 4;
				}
				break;
			}
		}
		
		num = 0;
		for(int i = 0; i < array.length; i++) {
			num = num*10 + array[i];
		}
		return num;
	}
}
