//Here I am using the input array apart from that additional array of size n to store the time taken by each Monster.


class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] timeToReach = new int[n];

        for(int i = 0; i<n; i++){
            timeToReach[i] = (dist[i] -1) / speed[i]; 
            // calculate time needed to reach the city
        }

        Arrays.sort(timeToReach);
        // Sort te time taken by monster

        int eliminated = 0;
        for(int i = 0; i<n; i++){
            if(timeToReach[i] < i){
        // If any monster reaches before the time to eliminate
                break;
            }
            eliminated++;
        }
        return eliminated;
    }
}