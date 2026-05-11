class Solution {
    public int longestConsecutive(int[] nums) {
        int sequence = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums)
        {
            numSet.add(n);
        }

        for (int n : nums)  // cannot be for (int i =...) because 1st list goes from 2, 4, to 10, to 4, 5, etc.
        {
            if (!numSet.contains(n - 1))
            {
                int length = 1;
                while (numSet.contains(n + length))
                {
                    length++;
                }
                sequence = Math.max(sequence, length);
            }
        }
        return sequence;
    }
}
