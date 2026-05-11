class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        for (i = 0, j = 0; i < w1.length && j < w2.length; i++, j++)
        {
            sb.append(w1[i]);
            sb.append(w2[j]);
        }
        
        if (w2.length > w1.length)
        {
            for (i = j; i < w2.length; i++)
            {
                sb.append(w2[i]);
            }
        }
        else {
            for (j = i; j < w1.length; j++)
            {
                sb.append(w1[j]);
            }
        }

        return sb.toString();
    }
}