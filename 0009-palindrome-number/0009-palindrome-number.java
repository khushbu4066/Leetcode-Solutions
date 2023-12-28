class Solution {
    public boolean isPalindrome(int n) {
        int revN = 0;
		int temp = n;

		while(n>0){
			int ld = n%10;
			n = n/10;

			revN = (revN*10)+ld;
			
			}
			if(revN == temp){
				return true;
			}
			else{
				return false;
			}
        
    }
}