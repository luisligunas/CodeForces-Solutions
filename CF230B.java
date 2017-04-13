import java.io.*;

public class CF230B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static boolean[] composite;
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        long max = 0;
        for(int i = 0; i < split.length; i++) {
            max = Math.max(max, Long.parseLong(split[i]));
        }
        composite = new boolean[(int) Math.sqrt(max) + 1];
        fillSieve();
        
        for(int i = 0; i < split.length; i++) {
            long num = Long.parseLong(split[i]);
            
            int intSqrt = (int) Math.sqrt(num);
            long longSqrt = intSqrt;
            
            if(longSqrt*longSqrt == num && !composite[intSqrt]) pw.println("YES");
            else pw.println("NO");
        }
        
        pw.close();
    }

    public static void fillSieve() {
        composite[1] = true; //not true, but for the code's sake
        
        for(int i = 2; i < composite.length; i++) {
            if(!composite[i]) {
                for(int j = 2; i*j < composite.length; j++) {
                    composite[i*j] = true;
                }
            }
        }
    }
}