import java.io.*;
import java.util.HashSet;

public class CF271A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int year = Integer.parseInt(br.readLine()) + 1;
        HashSet<Integer> hash = new HashSet<Integer>();
        
        while(true) {
            int curr = year;
            hash.clear();
            
            while(curr > 0) {
                hash.add(curr % 10);
                curr /= 10;
            }
            if(hash.size() == 4) {
                pw.println(year);
                break;
            }
            year++;
        }
        
        pw.close();
    }
}