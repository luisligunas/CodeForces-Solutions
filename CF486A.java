import java.io.*;

public class CF486A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());
        
        if(n % 2 == 1) pw.print("-");
        pw.println((n + 1)/2);
        
        pw.close();
    }
}