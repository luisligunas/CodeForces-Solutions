import java.io.*;

public class CF734B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int two = Integer.parseInt(split[0]);
        int three = Integer.parseInt(split[1]);
        int five = Integer.parseInt(split[2]);
        int six = Integer.parseInt(split[3]);
        
        int twoFiveSix = Math.min(Math.min(two, five), six);
        two -= twoFiveSix;
        int threeTwo = Math.min(two, three);
        
        pw.println(256*twoFiveSix + 32*threeTwo);
        
        pw.close();
    }
}