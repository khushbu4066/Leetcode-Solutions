class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxCustomer = 0;

        for(int i = 0; i < grumpy.length; i++){

            if(grumpy[i] != 1){
                maxCustomer +=  customers[i];
            }
        }

        int maxGrumpyVal = 0;
        int curGrumpyVal = 0;

        for(int i = 0; i < minutes; i++){
            if(grumpy[i] ==1){
                curGrumpyVal += customers[i];
            }
        }

        maxGrumpyVal = curGrumpyVal;

        for(int i = minutes; i < customers.length; i++){
            int firstIndex = i-minutes;
            if(grumpy[firstIndex] == 1)
            curGrumpyVal -= customers[firstIndex];

            if(grumpy[i] == 1){

                curGrumpyVal = (curGrumpyVal < 0) ? 0 : curGrumpyVal;
                curGrumpyVal += customers[i];
                maxGrumpyVal = Math.max(curGrumpyVal, maxGrumpyVal);
            }
        }
      return maxCustomer+maxGrumpyVal;  
    }
}