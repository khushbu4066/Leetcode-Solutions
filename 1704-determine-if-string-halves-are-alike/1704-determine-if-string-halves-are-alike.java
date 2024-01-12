class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0,b = 0,l = s.length();
        s = s.toLowerCase();
        for(int i=0;i<l;i++){
            if(i<l/2 && isVowel(s.charAt(i))) a++; //1st half
            else if(i>=l/2 && isVowel(s.charAt(i))) b++; //2nd half
        }
        return a==b;
    }
    static boolean isVowel(char x){
        return(x=='a' || x=='e' || x=='i' || x=='o' || x=='u');
    }
}