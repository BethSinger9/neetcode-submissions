class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs)
        {
            char[] string = s.toCharArray();
            Arrays.sort(string);
            String sorted = new String(string);
            anagrams.putIfAbsent(sorted, new ArrayList<>());
            anagrams.get(sorted).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}