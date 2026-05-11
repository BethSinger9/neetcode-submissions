class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dupes = list();
        for num in nums:
            if num in dupes:
                return True
            if num not in dupes:
                dupes.append(num)
        return False
            
        