class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        for (i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
        }

        sb.append(word1.substring(i));
        sb.append(word2.substring(j));

        return sb.toString();
        
    }
}