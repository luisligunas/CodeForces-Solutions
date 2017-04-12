import java.io.*;

public class CF459A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int x1 = Integer.parseInt(split[0]);
        int y1 = Integer.parseInt(split[1]);
        int x2 = Integer.parseInt(split[2]);
        int y2 = Integer.parseInt(split[3]);
        
        if(x1 == x2) {
            int newX = x1 + Math.abs(y1 - y2);
            pw.println(newX + " " + y1 + " " + newX + " " + y2);
        }
        else if(y1 == y2) {
            int newY = y1 + Math.abs(x1 - x2);
            pw.println(x1 + " " + newY + " " + x2 + " " + newY);
        }
        else if(Math.abs(x1 - x2) == Math.abs(y1 - y2))
            pw.println(x1 + " " + y2 + " " + x2 + " " + y1);
        else
            pw.println(-1);
        
        pw.close();
    }
}