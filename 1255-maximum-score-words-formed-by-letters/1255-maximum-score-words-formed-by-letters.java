class Solution {
   HashMap<Character,Integer>mp;

   public int sol(String[] words,int[]score,int i){
      if(i==words.length)return 0;

      int ans=0;
      HashMap<Character,Integer>m1=new HashMap<>();
      boolean valid=true;
      for(int j=0;j<words[i].length();j++){
             m1.put(words[i].charAt(j),m1.getOrDefault(words[i].charAt(j),0)+1);

             if(!mp.containsKey(words[i].charAt(j)) || m1.get(words[i].charAt(j))>mp.get(words[i].charAt(j)))valid=false;
      }
      if(valid){
        int val=0;
          for(char a:m1.keySet()){
             mp.put(a,mp.get(a)-m1.get(a));
             val+=m1.get(a)*score[a-'a'];
             }
           ans= val+sol(words,score,i+1);

          for(char a:m1.keySet()){
             mp.put(a,mp.get(a)+m1.get(a));  
           }
      }
      ans=Math.max(sol(words,score,i+1),ans);
     return ans; 
   }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        mp=new HashMap<>();

        for(int i=0;i<letters.length;i++){
             mp.put(letters[i],mp.getOrDefault(letters[i],0)+1);
        }
       return sol(words,score,0);
    }
}