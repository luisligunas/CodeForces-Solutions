import java.io.*;

public class CF580A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] money = new int[split.length];
        
        for(int i = 0; i < money.length; i++) {
            money[i] = Integer.parseInt(split[i]);
        }
        
        int max = 1;
        int count = 1;
        for(int i = 1; i < money.length; i++) {
            if(money[i] >= money[i-1]) {
                count++;
                max = Math.max(max, count);
            }
            else
                count = 1;
        }
        pw.println(max);
        
        pw.close();
    }
}