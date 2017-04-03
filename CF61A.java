import java.io.*;
import java.math.BigInteger;

public class CF61A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        
        BigInteger num = new BigInteger(g, 2);
        BigInteger num2 = new BigInteger(br.readLine(), 2);
        
        String out = num.xor(num2).toString(2);
        
        while(out.length() < g.length()) {
            out = "0" + out;
        }
        
        pw.println(out);
        
        pw.close();
    }
}