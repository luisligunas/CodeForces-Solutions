import java.io.*;

public class CF621A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        long total = 0;
        long odd1 = Long.MAX_VALUE, odd2 = Long.MAX_VALUE;
        
        for(int i = 0; i < split.length; i++) {
            long num = Long.parseLong(split[i]);
            
            if(num % 2 == 0) total += num;
            else {
                if(odd1 == Long.MAX_VALUE) odd1 = num;
                else if(odd2 == Long.MAX_VALUE) odd2 = num;
                else {
                    long remains = Math.min(Math.min(odd1, odd2), num);
                    total += odd1 + odd2 + num - remains;
                    odd2 = Long.MAX_VALUE;
                    odd1 = remains;
                }
            }
        }
        if(odd2 != Long.MAX_VALUE) total += odd1 + odd2;
        
        pw.println(total);
        
        pw.close();
    }
}