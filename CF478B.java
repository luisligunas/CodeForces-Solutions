import java.io.*;

public class CF478B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        long n = Long.parseLong(split[0]);
        long m = Long.parseLong(split[1]);
        
        //minimum if teams are made as equal as possible
        long min = summation(n/m)*(m - n%m) + summation(n/m + 1)*(n % m);
        //maximum if teams are made as lobsided as possible
        long max = summation(n - m + 1);
        
        pw.println(min + " " + max);
        
        pw.close();
    }
    public static long summation(long n) {
        return n*(n-1)/2;
    }
}