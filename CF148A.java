import java.io.*;

public class CF148A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int[] divisors = new int[4];
        
        for(int i = 0; i < divisors.length; i++) {
            divisors[i] = Integer.parseInt(br.readLine());
        }
        boolean[] sieve = new boolean[Integer.parseInt(br.readLine()) + 1];
        
        for(int i = 0; i < divisors.length; i++) {
            for(int j = 1; divisors[i]*j < sieve.length; j++) {
                sieve[divisors[i]*j] = true;
            }
        }
        
        int count = 0;;
        for(int i = 0; i < sieve.length; i++) {
            if(sieve[i]) count++;
        }
        pw.println(count);
        
        pw.close();
    }
}