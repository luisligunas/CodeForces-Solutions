import java.io.*;

public class CF82A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] people = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = Integer.parseInt(br.readLine());
        
        int multiplier = 1;
        int curr = 0;
        
        while(true) {
            if(curr + multiplier*people.length >= n) {
                int temp = (n - curr - 1)/multiplier;
                pw.println(people[temp]);
                break;
            }
            curr += multiplier*people.length;
            multiplier *= 2;
        }
        
        pw.close();
    }
}