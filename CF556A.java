import java.io.*;

public class CF556A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String inp = br.readLine();
        int numOnes = 0;
        
        for(int i = 0; i < inp.length(); i++) {
            if(inp.charAt(i) == '1')
                numOnes++;
        }
        
        //print the absolute value of the difference of number of ones and number of zeros
        pw.println(Math.abs(inp.length() - 2*numOnes));
        
        pw.close();
    }
}