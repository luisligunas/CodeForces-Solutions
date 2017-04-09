import java.io.*;

public class CF577A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int x = Integer.parseInt(split[1]);
        
        int min = Math.min(n, (int) Math.sqrt(x));
        int factors = 0;
        for(int i = 1; i <= min; i++) {
            if(x % i != 0) continue;
            
            if(i*i == x) factors++;
            else if(x / i <= n) factors += 2;
        }
        pw.println(factors);
        
        pw.close();
    }
}