package javaProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.List;
public class BfsImplementation {
	 public static void main(String[] args) {
		 Map<String, List<String>> g = new HashMap<String, List<String>>();
		 g.put("Reptail House", Arrays.asList("snake pit"));
		 g.put("Bird sanctuary", Arrays.asList("parrot pavilion"));
		 g.put("Mammal Zone", Arrays.asList("Lion Den","Elephant enclosure"));
		 g.put("snake pit",  new ArrayList<String>());
		 g.put("parrot pavilion",  new ArrayList<String>());
		 g.put("Lion Den",  new ArrayList<String>());
		 g.put("Elephant enclosure",  new ArrayList<String>());
		 bfs(g,"Reptail House");
	 }
	 public static void bfs(Map<String, List<String>> g,String start) {
		 Queue<String> queue = new LinkedList<String>();
		 Set<String> visited = new HashSet<String>();
		 queue.add(start);
		 visited.add(start);
		 while(!queue.isEmpty()) {
			 String currentRoom = queue.poll();
			 System.out.println("visited :"+currentRoom);
			 for(String neighbour : g.get(currentRoom)) {
				    if (!visited.contains(neighbour)) {
				        queue.add(neighbour);
				        visited.add(neighbour);
				    }
				}
			 
		 }
	 }
}
