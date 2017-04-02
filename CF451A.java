import java.io.*;

public class CF451A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int row = Integer.parseInt(split[0]);
        int col = Integer.parseInt(split[1]);
        
        if(Math.min(row, col) % 2 == 1) pw.println("Akshat");
        else pw.println("Malvika");
        
        pw.close();
    }
}