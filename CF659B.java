import java.io.*;
import java.util.*;

public class CF659B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main (String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n =  Integer.parseInt(split[0]);
		int m =  Integer.parseInt(split[1]);
		
		ArrayList<ArrayList<Person>> people = new ArrayList<ArrayList<Person>>();
		for(int i = 0; i < m; i++) people.add(new ArrayList<Person>());
		
		for(int z = 0; z < n; z++) {
			split = br.readLine().split(" ");
			
			String name = split[0];
			int region = Integer.parseInt(split[1]);
			int points = Integer.parseInt(split[2]);
			
			people.get(region - 1).add(new Person(name, points));
		}
		
		for(int i = 0; i < people.size(); i++) {
			Collections.sort(people.get(i));
			
			if(people.get(i).size() == 2 || (people.get(i).size() > 2 && people.get(i).get(1).points != people.get(i).get(2).points)) {
				pw.println(people.get(i).get(0).name + " " + people.get(i).get(1).name);
			}
			else {
				pw.println("?");
			}
		}
		
		pw.close();
	}
	public static class Person implements Comparable<Person> {
		String name;
		int points;
		
		public Person(String n, int p) {
			name = n;
			points = p;
		}
		
		public int compareTo(Person p) {
			return p.points - points;
		}
	}
}
