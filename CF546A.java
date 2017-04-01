import java.io.*;

public class CF546A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int k = Integer.parseInt(split[0]); //cost of first banana
        int n = Integer.parseInt(split[1]); //current money
        int w = Integer.parseInt(split[2]); //bananas he'll buy
        
        int totalCost = w*(w+1)/2 * k;
        
        if(n >= totalCost) pw.println(0);
        else pw.println(totalCost - n);
        
        pw.close();
    }
}
