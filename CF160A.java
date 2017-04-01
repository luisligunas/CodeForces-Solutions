import java.io.*;
import java.util.Arrays;

public class CF160A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int[] coins = new int[Integer.parseInt(br.readLine())];
        String[] split = br.readLine().split(" ");
        
        int total = 0;
        for(int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(split[i]);
            total += coins[i];
        }
        
        Arrays.sort(coins);
        
        int sum = 0;
        for(int i = coins.length - 1; i >= 0; i--) {
            sum += coins[i];
            if(2*sum > total) {
                pw.println(coins.length - i);
                break;
            }
        }
        
        pw.close();
    }
}