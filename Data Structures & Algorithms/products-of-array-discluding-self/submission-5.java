class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int n = nums.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++)
        {
            int num = 1;
            for (int j = 0; j < n; j++)
            {
                if (i != j)
                {
                    num *= nums[j];
                }
            }
            output[i] = num;
        }

        return output;
    
    }
}  
