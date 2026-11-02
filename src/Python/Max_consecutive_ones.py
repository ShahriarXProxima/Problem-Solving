class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        max_occurrence = 0
        count = 0

        for element in nums:
            if element == 0:
                count = 0
                continue
            count += 1
            max_occurrence = max(count, max_occurrence)

        return max_occurrence
