import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class CF455A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static ArrayList<Pair> entries;
    static long[] dp;
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for(int i = 0; i < split.length; i++) {
            long num = Long.parseLong(split[i]);
            
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, new Long(1));
        }
        
        entries = new ArrayList<Pair>();
        for(Entry<Long, Long> entry : map.entrySet()) {
            entries.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(entries);
        
        dp = new long[entries.size()];
        pw.println(recurse(0));
        
        pw.close();
    }
    public static long recurse(int num) {
        if(num >= dp.length) return 0;
        if(dp[num] != 0) return dp[num];
        
        Pair pair = entries.get(num);
        
        long take = pair.key*pair.value;
        long skip = recurse(num + 1);
        
        if(num < dp.length - 1 && pair.key + 1 != entries.get(num + 1).key)
            take += skip;
        else
            take += recurse(num + 2);
        
        dp[num] = Math.max(take, skip);
        return dp[num];
    }
    public static class Pair implements Comparable<Pair> {
        long key, value;
        
        public Pair(long key, long value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public int compareTo(Pair p) {
            if(key < p.key) return -1;
            else if(key == p.key) return 0;
            return 1;
        }
        
    }
}