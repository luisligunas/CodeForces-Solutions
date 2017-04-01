import java.io.*;

public class CF1A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        long n = Long.parseLong(split[0]);
        long m = Long.parseLong(split[1]);
        long a = Long.parseLong(split[2]);
        
        long row = n/a;
        if(n % a != 0) row++;
        long col = m/a;
        if(m % a != 0) col++;
        
        pw.println(row*col);
        
        pw.close();
    }
}