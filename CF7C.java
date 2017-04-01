import java.io.*;

public class CF7C {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static long x, y; // ax + by = gcd(a, b)
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long c = -Long.parseLong(split[2]);
        
        long gcd = extendedGCD(a, b);
        
        if(c % gcd == 0) {
            c /= gcd;
            long i = x*c;
            long j = y*c;
            
           pw.println(i + " " + j);
        }
        else pw.println(-1);
        pw.close();
    }
    
    public static long extendedGCD(long a, long b) {
        if (b == 0) { 
            x = 1;
            y = 0;
            return a;
        }
        long g = extendedGCD(b, a % b);
        long z = x - (a / b) * y;
        x = y;
        y = z;
        return g;
    }

}