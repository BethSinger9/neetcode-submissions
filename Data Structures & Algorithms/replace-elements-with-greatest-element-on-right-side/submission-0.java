class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++)
        {
            int rt = -1;
            for (int j = i + 1; j < n; j++)
            {
                rt = Math.max(rt, arr[j]);
            }
            answer[i] = rt;
        }

        return answer;
        
        
    }
}