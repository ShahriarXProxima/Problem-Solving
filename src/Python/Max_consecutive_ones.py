class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        max_occurence = 0
        count = 0

        for element in nums:
            if element == 0:
                count = 0
                continue
            count += 1
            max_occurence = max(count, max_occurence)

        return max_occurence
