class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = 0;

        for (int num : nums)
        {
            if (!map.containsKey(num))
            {
                map.put(num, map.getOrDefault(num - 1, 0) + map.getOrDefault(num + 1, 0) + 1);
                map.put(num - map.getOrDefault(num - 1, 0), map.get(num));
                map.put(num + map.getOrDefault(num + 1, 0), map.get(num));

                length = Math.max(length, map.get(num));
            }
        }

        return length;
    }
}
