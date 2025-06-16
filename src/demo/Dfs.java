package javaProjects;

import java.util.*;

public class Dfs {
	
	private Map<String, List<String>> homemap = new HashMap<>();
	private Set<String> visited = new HashSet<>();
	public void addRoom(String room,String connectedRoom) {
		homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
		homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>());
	}
	public void dfs(String currentRoom) {
		if(visited.contains(currentRoom)) return;
		visited.add(currentRoom);
		System.out.println("Visited :" + currentRoom);
		for(String neighbour : homemap.getOrDefault(currentRoom, new ArrayList<>())) {
			dfs(neighbour);
		}
	}

	public static void main(String[] args) {
		  Dfs home = new Dfs();
		  home.addRoom("Living Room", "Kitchen");
		  home.addRoom("Living Room", "Bedroom");
		  home.addRoom("Bedroom", "Bathroom");
		  home.dfs("Living Room");
	}

}
