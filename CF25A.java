import java.io.*;

public class CF25A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] nums = new int[split.length];
        
        for(int i = 0 ; i < nums.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        boolean majorityOdd = (isOdd(nums[0]) && (isOdd(nums[1]) || isOdd(nums[2]))) ||
                                (isOdd(nums[1]) && isOdd(nums[2]));
        
        for(int i = 0; i < nums.length; i++) {
            if(majorityOdd ^ isOdd(nums[i])) {
                pw.println(i + 1);
                break;
            }
        }
        
        pw.close();
    }
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }
}