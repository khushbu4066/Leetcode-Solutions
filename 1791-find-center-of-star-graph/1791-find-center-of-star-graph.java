class Solution {
    public int findCenter(int[][] edges) {

        int n = edges.length;

        int [] counter = new int[n+2];

        for(int[] edge : edges){
            for(int e : edge){
                if(counter[e]>0) return e;
                counter[e]++;
            }
        }
        return 0;
    }
}