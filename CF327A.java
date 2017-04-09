//There's a greedy solution to this but I just can't code it right for some reason.
import java.io.*;

public class CF327A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        int[] inp = new int[split.length];
        //left and right will contain the number of 1s to the left and right of a certain index (exclusive)
        int[] left = new int[split.length];
        int[] right = new int[split.length];
        
        for(int i = 0; i < inp.length; i++) inp[i] = Integer.parseInt(split[i]);
        for(int i = 1; i < inp.length; i++) {
            left[i] = left[i-1];
            if(inp[i-1] == 1) left[i]++;
            
            right[right.length - i - 1] = right[right.length - i];
            if(inp[right.length - i] == 1) right[right.length - i - 1]++;
        }
        
        int max = 0;
        for(int l = 0; l < inp.length; l++) {
            if(inp[l] == 1) continue;
            for(int r = l; r < inp.length; r++) {
                if(inp[r] == 1) continue;
                
                //count number of ones before l and after r
                int outterOnes = left[l] + right[r];
                //now count number of zeros on [l,r]
                int innerZeros = (r - l - 1) - (left[r] - left[l]) + 2;
                
                max = Math.max(max, outterOnes + innerZeros);
            }
        }
        if(left[left.length - 1] + 1 == left.length && inp[left.length - 1] == 1) pw.println(left.length - 1);
        else pw.println(max);
        
        pw.close();
    }
}