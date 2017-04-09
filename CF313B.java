import java.io.*;

public class CF313B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String inp = br.readLine();
        int[] same = new int[inp.length()];
        
        for(int i = 1; i < inp.length(); i++) {
            if(inp.charAt(i) == inp.charAt(i-1)) same[i]++;
            same[i] += same[i-1];
        }
        
        int numQueries = Integer.parseInt(br.readLine());
        String[] split;
        
        for(int i = 0; i < numQueries; i++) {
            split = br.readLine().split(" ");
            pw.println(Math.abs(same[Integer.parseInt(split[0]) - 1] - same[Integer.parseInt(split[1]) - 1]));
        }
        
        pw.close();
    }
}