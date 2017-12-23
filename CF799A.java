import java.io.*;

public class CF799A {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int t = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);

        if (getTimeWithOneOven(n, t, k) <= getTimeWithTwoOvens(n, t, k, d)) {
            pw.println("NO");
        } else {
            pw.println("YES");
        }

        pw.close();
    }

    public static int getTimeWithOneOven(int n, int t, int k) {
        return (n + k - 1) / k * t;
    }

    public static int getTimeWithTwoOvens(int n, int t, int k, int d) {
        int bakedCakes = d / t * k;
        //after d seconds (second oven is now built)
        int cakesLeft = n - bakedCakes;
        //number of cakes left to make after d seconds

        int turns = (cakesLeft + k - 1) / k;

        if (turns % 2 == 0) {
            //second oven ends it
            return turns / 2 * t + d;
        }
        //first oven ends it
        return (turns + 1) / 2 * t + d;
    }
}
