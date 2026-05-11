class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int i, j;

        for (i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++)
        {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(j);
            sb.append(char1);
            sb.append(char2);
        }
        
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));
        return sb.toString();
    }
}