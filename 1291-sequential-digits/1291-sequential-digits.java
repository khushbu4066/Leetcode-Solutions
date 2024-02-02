class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer>res = new ArrayList<>();
        for(int i = 1; i<=9; i++){
            helper(0, i, low, high, res);
        }
        Collections.sort(res);
        return res;
    }

    void helper(int curr, int digit, int low, int high, List<Integer>res){
        curr = curr * 10 + digit;

        if(curr > high){
            return;
        }

        if(curr >= low){
            res.add(curr);
        }
        if(digit+1 <= 9)
            helper(curr, digit+1, low, high, res);
        
    }
}