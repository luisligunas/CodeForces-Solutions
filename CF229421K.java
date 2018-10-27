import java.util.*;
import java.io.*;

public class CF229421K {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int d = Integer.parseInt(split[1]); //need to save
		int k = Integer.parseInt(split[2]); //max num employees
		
		long total = 0;
		Emp[] employees = new Emp[n];
		
		for(int i = 0; i < n; i++) {
			split = br.readLine().split(" ");
			employees[i] = new Emp(split[0], Integer.parseInt(split[1]));
			total += (long) employees[i].sal;
		}
		if(total < d)
			pw.println("impossible");
		else {
			Arrays.sort(employees);
			long count = 0;
			int bilang = 0;
			for(Emp emp : employees) {
				if(count >= d)
					break;
				bilang++;
				count += emp.sal;
			}
			if(bilang > k) {
				pw.println("impossible");
			}
			else {
				pw.println(bilang);
				for(int i = 0; i < bilang; i++)
					pw.println(employees[i].name + ", YOU ARE FIRED!");
			}
		}
		
		
		pw.close();
	}
	
	public static class Emp implements Comparable<Emp> {
		String name;
		int sal;
		
		public Emp(String a, int b) {
			name = a;
			sal = b;
		}
		
		public int compareTo(Emp emp) {
			return emp.sal - sal;
		}
	}
}
