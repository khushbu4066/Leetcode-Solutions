class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        convertTreeToGraph(root,0,map);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        int minutes = 0;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            while(levelSize > 0) {
                int current = queue.poll();
                for(int num : map.get(current)){
                    if(!visited.contains(num)){
                        queue.add(num);
                        visited.add(num);
                    }
                }
                levelSize--;
            }
            minutes++;
        }
        return minutes - 1;
    }
    private void convertTreeToGraph(TreeNode current, int parent, Map<Integer, Set<Integer>>map) {
        if(current != null){
            if(!map.containsKey(current.val)) {
                map.put(current.val, new HashSet<>());
            }
            Set<Integer> adjacentList = map.get(current.val);
            if(parent != 0) {
                adjacentList.add(parent);
            }
            if(current.left != null){
                adjacentList.add(current.left.val);
            }
            if(current.right != null){
                adjacentList.add(current.right.val);
            }
            convertTreeToGraph(current.left, current.val, map);
            convertTreeToGraph(current.right, current.val, map);
        }
    }
}