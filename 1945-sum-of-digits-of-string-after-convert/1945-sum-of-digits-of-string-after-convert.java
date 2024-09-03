class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }

        long counter = 0;
        int index = 0;
        String numbers = sb.toString();
        
        while(index < k) {
            counter = 0;
            for(char c: numbers.toCharArray()) {
                counter += c - '0';
            }

            numbers = counter +"";
            index++;
        }

        return (int) counter;

    }
}