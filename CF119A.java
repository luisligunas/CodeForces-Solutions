import java.io.*;

public class CF119A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int n = Integer.parseInt(split[2]);
        
        boolean simonsTurn = true;
        while(true) {
            int num = simonsTurn ? a : b;
            int gcd = gcd(n, num);
            if(n < gcd) break;
            
            n -= gcd;
            simonsTurn = !simonsTurn;
        }
        if(simonsTurn) pw.println(1);
        else pw.println(0);
        
        pw.close();
    }
    public static int gcd(int a, int b) {
        if(a*b == 0) return a + b;
        return gcd(b, a % b);
    }
}