class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[][] prefMap = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                prefMap[i][preferences[i][j]] = j;
            }
        }
        
        int a,b,prefA,prefB,prefEle1,prefEle2,ele1,ele2;
        int count = 0;
        boolean[] flags = new boolean[n];
        for (int i = 0; i < pairs.length; i++) {
            a = pairs[i][0];
            b = pairs[i][1];
            prefB = prefMap[a][b];
            prefA = prefMap[b][a];
            for (int j = i+1; j < pairs.length; j++) {
                ele1 = pairs[j][0];
                ele2 = pairs[j][1];
                prefEle2 = prefMap[ele1][ele2];
                prefEle1 = prefMap[ele2][ele1];
      
                if (prefB > prefMap[a][ele1] && prefEle2 > prefMap[ele1][a]) {
                    flags[a] = true;
                    flags[ele1] = true;
                }
                if (prefB > prefMap[a][ele2] && prefEle1 > prefMap[ele2][a]) {
                    flags[a] = true;
                    flags[ele2] = true;
                }
                
                if (prefA > prefMap[b][ele1] && prefEle2 > prefMap[ele1][b]) {
                    flags[b] = true;
                    flags[ele1] = true;
                }
                if (prefA > prefMap[b][ele2] && prefEle1 > prefMap[ele2][b]) {
                    flags[b] = true;
                    flags[ele2] = true;
                }
            }
            
        }
        
        for (boolean flag : flags) {
            if (flag) {
                count++;
            }
        }
        return count;
    }
}