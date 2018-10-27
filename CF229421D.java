import java.util.*;
import java.io.*;

public class CF229421D {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	static int[][] isAncestor = new int[194][194];
	static ArrayList<Node> nodes = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		HashMap<String, Integer> sti = new HashMap<>();
		
		
		for(int i = 0; i < n; i++) {
			split = br.readLine().split(" are worse than ");
			String a = split[0]; 
			String b = split[1];
			
			Node na = null;
			if(!sti.containsKey(a)) {
				na = new Node(a, nodes.size());
				sti.put(a, nodes.size());
				nodes.add(na);
			}
			else
				na = nodes.get(sti.get(a));
			
			Node nb = null;
			if(!sti.containsKey(b)) {
				nb = new Node(b, nodes.size());
				sti.put(b, nodes.size());
				nodes.add(nb);
			}
			else
				nb = nodes.get(sti.get(b));
			
			na.parents.add(nb);
		}
		
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" are worse than ");
			String a = split[0]; 
			String b = split[1];
			
			if(!sti.containsKey(a) || !sti.containsKey(b)) {
				pw.println("Pants on Fire");
				continue;
			}
			int aint = sti.get(a);
			int bint = sti.get(b);
			if(isAncestor(bint, aint))
				pw.println("Fact");
			else if(isAncestor(aint, bint))
				pw.println("Alternative Fact");
			else
				pw.println("Pants on Fire");
		}
		
		
		
		pw.close();
	}
	
	//1 = true
	//-1 = false
	public static boolean isAncestor(int aint, int bint) {
		if(isAncestor[aint][bint] != 0)
			return isAncestor[aint][bint] == 1;
		
		Node a = nodes.get(aint);
		Node b = nodes.get(bint);
		
		for(Node parent : b.parents) {
			if(parent == a || isAncestor(a.ind, parent.ind)) {
				isAncestor[aint][bint] = 1;
				return true;
			}
		}
		isAncestor[aint][bint] = -1;
		return false;
		
	}
	
	public static class Node {
		String name;
		int ind;
		ArrayList<Node> parents = new ArrayList<Node>();
		
		public Node(String g, int i) {
			name = g;
			ind = i;
		}
	}
}
