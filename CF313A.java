import java.io.*;

public class CF313A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int balance = Integer.parseInt(br.readLine());
        
        if(balance < 0) {
            int last = -balance%10;
            int secondToLast = -(balance%100)/10;

            if(last > secondToLast) balance /= 10;
            else balance = 10*(balance/100) + balance%10;
        }
        
        pw.println(balance);
        
        pw.close();
    }
}