import java.io.*;

public class CF466A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        
        int totalCost = 0;
        
        int multiCost = Math.min(b, a*m);
        totalCost += (n/m)*multiCost;
        n -= (n/m)*m;
        
        int remainsCost = Math.min(b, a*n);
        totalCost += remainsCost;
        
        pw.println(totalCost);
        
        pw.close();
    }
}