import java.io.*;
import java.util.*;

public class CF816A {
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Time time = new Time(br.readLine());
		int count = 0;
		
		while(!isPalindrome(time)) {
			count++;
			time.tick();
		}
		
		pw.println(count);
		
		pw.close();
	}
	public static boolean isPalindrome(Time time) {
		return time.h/10 == time.m%10 && time.h%10 == time.m/10;
	}
	public static class Time {
		int h, m;
		public Time(String s) {
			h = Integer.parseInt(s.substring(0, 2));
			m = Integer.parseInt(s.substring(3));
		}
		public void tick() {
			m += 1;
			if(m == 60) {
				m = 0;
				h++;
			}
			if(h == 24) h = 0;
		}
	}
}
