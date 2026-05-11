class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        combined = nums1 + nums2
        combined.sort()

        length = len(combined)

        if (length % 2 == 0):
            return (combined[length // 2 - 1] + combined[length // 2]) / 2.0
        else:
            return combined[length // 2]

        
        







        