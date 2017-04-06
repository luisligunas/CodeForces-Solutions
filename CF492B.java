import java.io.*;
import java.util.Arrays;

public class CF492B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] split = br.readLine().split(" ");
        int[] lanterns = new int[split.length];
        
        for(int i = 0; i < lanterns.length; i++) {
            lanterns[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(lanterns);
        
        //get both ends
        int doubleMax = 2*Math.max(lanterns[0], length - lanterns[lanterns.length - 1]);
        
        //get middle
        for(int i = 0; i < lanterns.length - 1; i++) {
            doubleMax = Math.max(doubleMax, lanterns[i+1] - lanterns[i]);
        }
        
        if(doubleMax % 2 == 0) pw.println(doubleMax/2 + ".0000000000");
        else pw.println(doubleMax/2 + ".5000000000");
        
        pw.close();
    }
}