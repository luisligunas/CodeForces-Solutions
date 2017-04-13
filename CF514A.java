import java.io.*;

public class CF514A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        char[] digits = br.readLine().toCharArray();
        
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] > '4') {
                if(i != 0 || digits[i] != '9')
                    digits[i] = (char) ('9' - digits[i] + '0');
            }
            pw.print(digits[i]);
        }
        pw.println();
        
        pw.close();
    }
}