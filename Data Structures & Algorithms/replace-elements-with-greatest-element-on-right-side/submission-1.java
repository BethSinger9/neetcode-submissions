class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] greatest = new int[length];

        for (int i = 0; i < length; i++)
        {
            int right = -1;
            for (int j = i + 1; j < length; j++)
            {
                right = Math.max(right, arr[j]);
            }
            greatest[i] = right;
        }

        return greatest;
    }
}