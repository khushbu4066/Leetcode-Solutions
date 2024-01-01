class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        
        if(arr==null  || arr.length==0)
            return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        int maxLen =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int left=i, right = j, count =0;
                while(map.containsKey(arr[left] +arr[right]))
                {
                    int temp = right;
                    right = map.get(arr[left] + arr[right]);
                    left = temp;
                    count++;
                }
                //if exist a sequence add first two number
                if(count!=0)
                {
                    count +=2;
                    maxLen = Math.max(maxLen,count);
                }
            }
        }
        return maxLen;
    }
}