class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < words.length; i++) 
        {
            for (int j = 0; j < words.length; j++)
            {
                if (i == j) {
                    continue;
                } if (words[j].contains(words[i])) {
                    al.add(words[i]);
                    break;
                }
            }
        }
        return al;
    }
}