import java.io.*;

public class CF515A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int s = Integer.parseInt(split[2]);
        
        int optimal = Math.abs(a) + Math.abs(b);
        
        if((optimal % 2 == 0 ^ s % 2 == 0) || s < optimal) pw.println("No");
        else pw.println("Yes");
        
        pw.close();
    }
}