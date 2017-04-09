import java.io.*;

public class CF448A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int cups = Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + Integer.parseInt(split[2]);
        split = br.readLine().split(" ");
        int medals = Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + Integer.parseInt(split[2]);
        int n = Integer.parseInt(br.readLine());
        
        int shelvesNeeded = (int) Math.ceil(cups/5.0) + (int) Math.ceil(medals/10.0);
        
        if(shelvesNeeded <= n) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}