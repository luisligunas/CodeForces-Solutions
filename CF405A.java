import java.io.*;
import java.util.Arrays;

public class CF405A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] heights = new int[split.length];
        
        for(int i = 0; i < heights.length; i++) {
            heights[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(heights);
        
        for(int i = 0; i < heights.length; i++) {
            if(i != 0) pw.print(" ");
            pw.print(heights[i]);
        }
        pw.println();
        
        pw.close();
    }
}