package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

	private int V;
	private LinkedList<Integer> adj[];
	
	TopologicalSort(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	private void addEdge(int u, int v) {
		
		adj[u].add(v);
	}
	
	public static void main(String[] args) {
		
		TopologicalSort g = new TopologicalSort(6);
		 g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
  
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
  
        g.topoLogicalSorting();
	}

	private void topoLogicalSorting() {
		
		Stack<Integer> stack = new Stack<>();
		boolean visited[] = new boolean[V];
		for(int i=0; i<V; i++) {
			visited[i] = false;
		}
		for(int i=0; i<V; i++) {
			if(visited[i] == false)
			sortUtil(i, visited, stack);
		}
		
		while(stack.empty() == false) {
			System.out.print(stack.pop()+ " ");
		}
		
	}

	private void sortUtil(int v, boolean[] visited, Stack<Integer> stack ) {
		
		visited[v] = true;
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			
			int n = i.next();
			if(!visited[n]) {
				sortUtil(n, visited, stack);
			}
		}
		
		stack.push(v);
	}

	
}
