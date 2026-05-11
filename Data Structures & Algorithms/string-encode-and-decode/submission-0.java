class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String s : strs)
        {
            result.append(s.length()).append('#').append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length())
        {
            int j = i;
            while (str.charAt(j) != '#')
            {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));     // string
            i = j + 1;      // move i to character after #
            j = i + length;     // get the original string (from int length)
            result.add(str.substring(i, j));            // add exraced result to results
            i = j;      // move forward i
        }
        return result;

    }
}
