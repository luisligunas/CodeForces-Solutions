import java.io.*;

public class CF489C {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int m = Integer.parseInt(split[0]); //length
        int s = Integer.parseInt(split[1]); //sum
        
        if(m * 9 < s || (m != 1 && s == 0)) pw.println("-1 -1");
        else pw.println(getMin(m, s) + " " + getMax(m, s));
        
        pw.close();
    }

    public static String getMax(int m, int s) {
        StringBuilder max = new StringBuilder();
        
        while(s >= 9) {
            max.append(9);
            s -= 9;
            m--;
        }
        if(m > 0) {
            max.append(s);
            while(--m > 0) max.append(0);
        }
        
        return max.toString();
    }

    public static String getMin(int m, int s) {
        StringBuilder min = new StringBuilder();
        if(m == 1 && s == 0) return "0";
        
        int end = s/9;
        if(s % 9 != 0) end++;
        
        if(m > end) {
            min.append(1);
            s--;
            m--;
        }
        while(m > end) {
            min.append(0);
            m--;
        }
        
        if(m*9 == s) min.append(9);
        else min.append(s % 9);
        
        while(--m > 0) min.append(9);
        
        return min.toString();
    }
}