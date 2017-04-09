import java.io.*;
import java.util.Arrays;

public class CF149A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        
        int[] num = new int[split.length];
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(num);
        
        int curr = 0;
        int months = 0;
        while(months < num.length) {
            if(curr >= k) break;
            curr += num[num.length - 1 - months];
            months++;
        }
        
        if(curr < k) pw.println(-1);
        else pw.println(months);
        
        pw.close();
    }
}