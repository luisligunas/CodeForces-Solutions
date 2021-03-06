import java.io.*;

public class CF460A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		int day = 1;
		int socksLeft = n;
		while(true) {
			socksLeft--;
			
			if(day % m == 0) socksLeft++;
			if(socksLeft == 0) break;
			
			day++;
		}
		pw.println(day);
		
        pw.close();
    }
}