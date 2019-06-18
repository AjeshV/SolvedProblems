class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //[[1,2], [3], [3], []]
        //[0[1,2], 1[3], 2[3], 3[]]
        //0->1, 0->2, 1->3, 2->3, 3
        List<List<Integer>> allpaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        dfs(graph, 0, allpaths, path);
        return allpaths;
    }   
/*
working:
-------
dfs(graph, 0, allpaths, path);
	dfs(graph, 1, allpaths, path);		//path {0,1} allpaths{}
		dfs(graph, 3, allpaths, path);	//path {0,1,3} allpaths{{0,1,3}}
						//path {0,1}
						//path {0}
					      //for loop's nextNode.
	dfs(graph, 2, allpaths, path);		//path {0,2} allpaths{{0,1,3}}
		dfs(graph, 3, allpaths, path);	//path {0,2,3} allpaths{{0,1,3}, {0,2,3}}
						//path {0,2}
						//path {0}
*/    
    private void dfs(int[][] graph, int node, List<List<Integer>> allpaths, List<Integer> path){
        if (node == graph.length-1){
            allpaths.add(new ArrayList<Integer>(path));
            return;
        }
        
        for (int nextNode: graph[node]){
            path.add(nextNode);
            dfs(graph, nextNode, allpaths, path);
            path.remove(path.size() - 1);
        }
    }
}
