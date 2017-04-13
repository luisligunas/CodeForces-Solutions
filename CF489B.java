import java.io.*;
import java.util.Arrays;

public class CF489B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] boys = new int[split.length];
        for(int i = 0; i < boys.length; i++) boys[i] = Integer.parseInt(split[i]);
        Arrays.sort(boys);
        
        br.readLine();
        split = br.readLine().split(" ");
        int[] girls = new int[split.length];
        for(int i = 0; i < girls.length; i++) girls[i] = Integer.parseInt(split[i]);
        Arrays.sort(girls);
        
        int b = 0, g = 0, pairs = 0;
        
        while(b < boys.length && g < girls.length) {
            if(Math.abs(boys[b] - girls[g]) <= 1) {
                b++;
                g++;
                pairs++;
            }
            else if(boys[b] < girls[g]) b++;
            else g++;
        }
        
        pw.println(pairs);
        
        pw.close();
    }
}