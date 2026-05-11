class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        for (i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++)
        {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
        }
        result.append(word1.substring(i));
        result.append(word2.substring(j));

        return result.toString();
    }
}