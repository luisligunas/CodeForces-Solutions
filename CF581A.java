import java.io.*;

public class CF581A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int red = Integer.parseInt(split[0]);
        int blue = Integer.parseInt(split[1]);
        
        int different = Math.min(red, blue);
        red -= different;
        blue -= different;
        int same = red/2 + blue/2;
        
        pw.println(different + " " + same);
        
        pw.close();
    }
}