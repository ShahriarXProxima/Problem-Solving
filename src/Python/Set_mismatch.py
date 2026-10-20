class Solution:
    def findErrorNums(self, nums: list[int]) -> list[int]:
        nums.sort()

        duplicate = 0
        missing = 0
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                duplicate = nums[i]
                break

        for i in range(1, len(nums) + 1):
            if i not in nums:
                missing = i
                break

        return [duplicate, missing]
