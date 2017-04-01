import java.io.*;
import java.util.Arrays;

public class CF339A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split("\\+");
        int[] nums = new int[split.length];
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            if(i != 0) pw.print("+");
            pw.print(nums[i]);
        }
        pw.println();
        
        pw.close();
    }
}