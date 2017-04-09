import java.io.*;

public class CF588A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split;
        int days = Integer.parseInt(br.readLine());
        int minCost = Integer.MAX_VALUE;
        int spending = 0;
        
        for(int i = 0; i < days; i++) {
            split = br.readLine().split(" ");
            
            minCost = Math.min(minCost, Integer.parseInt(split[1]));
            spending += Integer.parseInt(split[0])*minCost;
        }
        pw.println(spending);
        
        pw.close();
    }
}