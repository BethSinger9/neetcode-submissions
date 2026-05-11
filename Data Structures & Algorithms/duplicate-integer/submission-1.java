class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupes = new HashSet<Integer>();
        for (int d : nums) {
            if (dupes.contains(d)) return true;
            dupes.add(d);
        }
        return false;
    }
}