import java.io.*;

public class CF750A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        
        //simplified by thinking that problem i only takes i minutes to solve
        int timeLeft = (240 - k)/5;
        int problemsSolved = (int) ((Math.sqrt(1 + 8*timeLeft) - 1)/2);
        
        if(problemsSolved > n) problemsSolved = n;
        
        pw.println(problemsSolved);
        
        pw.close();
    }
}