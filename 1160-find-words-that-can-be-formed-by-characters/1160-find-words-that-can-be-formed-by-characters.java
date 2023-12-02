class Solution {
    public int countCharacters(String[] words, String chars) {
        int count[] = new int[26];
        for(int i = 0; i < chars.length();i++)
        {
            int x = chars.charAt(i) - 'a';
            count[x]++;
        }
        int sum = 0;
        for(String s : words)
        {
            if(check(s,count))
            {
                sum += s.length();
            }
        }
        return sum;

    }
    public static boolean check(String s, int[] count)
    {
        int[] words_arr_length = new int [26];
        for(int i = 0; i < s.length();i++)
        {
             int y = s.charAt(i)-'a';
             words_arr_length[y]++;
             if(words_arr_length[y] > count[y])return false;
        }
        return true;
    }
}