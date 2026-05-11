class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs)
        {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            anagrams.putIfAbsent(sorted, new ArrayList<>());

            anagrams.get(sorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
