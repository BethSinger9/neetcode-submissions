class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            results.putIfAbsent(sorted, new ArrayList<>());
            results.get(sorted).add(s);   
        }
        return new ArrayList<>(results.values());
    }
}
