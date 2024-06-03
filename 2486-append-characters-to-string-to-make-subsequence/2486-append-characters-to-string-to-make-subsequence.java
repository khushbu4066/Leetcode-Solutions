
class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        if(t.length()==1 && s.indexOf(t.charAt(0))!=-1) return 0;
        int i=0,j=0;
        while(i<sA.length && j<tA.length){
            if(sA[i]==tA[j]){
                count++;
                j++;
            }
            i++;
        }
        return t.length() - count;
    }
}