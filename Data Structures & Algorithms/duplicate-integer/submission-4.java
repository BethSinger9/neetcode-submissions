class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (arrayList.contains(nums[i])) {
                return true;
            }
            arrayList.add(nums[i]);
        }
        return false;
    }
}