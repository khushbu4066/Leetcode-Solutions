class Solution {

    public boolean getBouquete(int [] bloomDay, int day, int m, int k){
        int bouquetCount = 0;
        int flowerCount = 0;
        for(int bloom : bloomDay){
            if(bloom<=day){
                flowerCount ++;
            }else{
                flowerCount = 0;
            }
            if(flowerCount == k){
                bouquetCount++;
                flowerCount =0;
            }
        }

        if(bouquetCount>= m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        if(bloomDay.length< m*k){
            return -1;
        }
        int maxDay = 0;
        for(int bloom : bloomDay){
            if(bloom>maxDay) maxDay = bloom;
        }

        int left = 1;
        int right = maxDay;

        int minDay = -1;

        while(left <= right){
            int mid = left+ (right-left)/2;
            if(getBouquete(bloomDay, mid, m,  k)){
                minDay = mid;
                right =mid-1;
            }else{
                left = mid+1;
            }
        }
        return minDay;
        
    }
}