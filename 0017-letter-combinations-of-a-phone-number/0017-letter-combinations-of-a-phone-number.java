class Solution {
    public void buildMap(HashMap<Character,String> hmap)
    {
        hmap.put('2',"abc");
        hmap.put('3',"def");
        hmap.put('4',"ghi");
        hmap.put('5',"jkl");
        hmap.put('6',"mno");
        hmap.put('7',"pqrs");
        hmap.put('8',"tuv");
        hmap.put('9',"wxyz");
    }
    public void backtrack(int len,String digits,HashMap<Character,String> hmap,String temp,List<String> result,int idx)
    {
        if(temp.length() == len)
        {
            result.add(new String(temp));
            return;
        }
        for(int i = 0;i<hmap.get(digits.charAt(idx)).length();i++)
        {
            temp = temp+hmap.get(digits.charAt(idx)).charAt(i);
            backtrack(len,digits,hmap,temp,result,idx+1);
            temp = temp.substring(0,temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Character,String> hmap = new HashMap<>();
        buildMap(hmap);
        if(digits.length() == 0)
            return result;
        backtrack(digits.length(),digits,hmap,"",result,0);
        return result;
    }
}