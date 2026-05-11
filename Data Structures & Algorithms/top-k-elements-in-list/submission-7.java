class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);        // lambda operator
        // sort elements, the comparison function takes a,b from array
        // if result if b[0] greater, b is placed before a in descending
        // else a is greater than b, so it's before b.

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
        {
            result[i] = arr.get(i)[1];      // get the first element of the array
        }
        return result;
    }
}
