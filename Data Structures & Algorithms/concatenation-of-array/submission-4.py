class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        new_nums = []

        for i in range(0, len(nums)):
            for j in range(0, 1):
                new_nums.append(nums[i])

        return new_nums*2
        
