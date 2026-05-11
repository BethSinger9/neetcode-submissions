class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dupes = []
        for i in range(0, len(nums)):
            if nums[i] in dupes:
                return True
            dupes.append(nums[i])
        return False

            