import java.util.*;
import java.io.*;

public class CF427C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	static ArrayList<Node> nodeList = new ArrayList<>();
	static ArrayList<ArrayList<Node>> scc = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		long[] costs = new long[split.length];
		for(int i = 0; i < split.length; i++) {
			costs[i] = Long.parseLong(split[i]);
			nodeList.add(new Node(i));
		}
		
		int E = Integer.parseInt(br.readLine());
		for(int i = 0; i < E ;i++) {
			split = br.readLine().split(" ");
			int u = Integer.parseInt(split[0]) - 1;
			int v = Integer.parseInt(split[1]) - 1;
			
			nodeList.get(u).to.add(nodeList.get(v));
		}
		
		tarjan();
		
		long total = 0;
		long totalCount = 1;
		for(ArrayList<Node> nodes : scc) {
			long min = Long.MAX_VALUE;
			int count = 0;
			for(Node node : nodes) {
				if(costs[node.id] < min) {
					min = Math.min(min, costs[node.id]);
					count = 1;
				}
				else if(costs[node.id] == min)
					count++;
			}
			totalCount = (totalCount * count) % 1000000007;
			total += min;
		}
		
		pw.println(total + " " + totalCount);
		
		pw.close();
	}
	
	
	public static int index = 0;
	public static Stack<Node> stack = new Stack<>();
	
	public static void strongConnect(Node node) {
		node.index = index;
		node.lowlink = index;
		index++;
		stack.push(node);
		node.onStack = true;
		
		for(Node v : node.to) {
			if(v.index == -1) {
				strongConnect(v);
				node.lowlink = Math.min(node.lowlink, v.lowlink);
			}
			else if(v.onStack)
				node.lowlink = Math.min(node.lowlink, v.index);
		}
		
		if(node.lowlink == node.index) {
			ArrayList<Node> scc_ = new ArrayList<>();
			while(true) {
				Node curr = stack.pop();
				curr.onStack = false;
				scc_.add(curr);
				
				if(curr == node)
					break;
			}
			scc.add(scc_);
		}
	}
	
	public static void tarjan() {
		for(Node node : nodeList) {
			if(node.index == -1)
				strongConnect(node);
		}
	}
	
	public static class Node {
		int id;
		int index, lowlink;
		boolean onStack = false;
		ArrayList<Node> to = new ArrayList<>();
		
		public Node(int id) {
			this.id = id;
			index = -1;
			lowlink = -1;
		}
	}
}
