class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
         int index = 1; 
		 List<List<Integer>> result = new ArrayList<>();
		 
		 if(nums.length == 0)
			 return result; 
		 
		 List<Integer> tmpList = new ArrayList<>();
		 tmpList.add(nums[0]);
		 result.add(tmpList);
		 
		 while (index < nums.length)
		 {
			 List<List<Integer>> tmpResult = new ArrayList<>();
			 
			 for (List<Integer> t : result )
			 {   int tsize = t.size() ;
				 for (int i =0 ; i <= tsize; i ++ )
				 {
					 ArrayList<Integer> tmp = new  ArrayList<>(t); 
					 tmp.add(i,  nums[index]);
					 tmpResult.add(tmp);
				 }
			 }
			 
			// System.out.println(tmpResult);
			 result = tmpResult ; 
			 index++ ;
		 }
	        return result ; 
        
    }
}