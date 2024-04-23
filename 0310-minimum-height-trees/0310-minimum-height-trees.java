class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        if(n<=0) return list;

        if(n==1) {
            list.add(0);
            return list;
        }

        int[] degree = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
            adj.add(new ArrayList<>());

        for(int[] arr : edges) {
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
            degree[arr[0]]++;
            degree[arr[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) 
            if(degree[i] == 1)
                q.offer(i);
        
        while(n>2) {
            int size = q.size();
            n-=size;

            for(int k=0; k<size; k++) {
                int val = q.poll();
                for(int i : adj.get(val)) {
                    if(--degree[i] == 1)
                        q.offer(i);
                }
            }
        }

        list.addAll(q);
        return list;
    }
}