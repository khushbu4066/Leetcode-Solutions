class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int ln = hand.length;
        if(ln == 0 || ln%groupSize != 0)
        {
            return false;
        }

        Arrays.sort(hand);
        HashSet<Integer> record = new HashSet<Integer>();

        for(int i=0; i<ln; i++)
        {
            int j=i;
            int index=0;
            if(!record.contains(j))
            {
                int item = hand[j];
                record.add(j);
                index++;
                j++;
                while(j<ln && index<groupSize)
                {
                    if(hand[j] == item+1 && !record.contains(j))
                    {
                        index++;
                        record.add(j);
                        item++;
                    }
                    j++;
                }
                if(index!=groupSize) return false;
            }
        }
        return true;
    }
}