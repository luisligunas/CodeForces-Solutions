import java.io.*;
import java.util.Arrays;

public class CF723A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int[] houses = new int[split.length];
        
        for(int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(houses);
        
        pw.println(houses[2] - houses[0]);
        
        pw.close();
    }
}