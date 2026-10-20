class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        k = 0
        for element in nums:
            if element != val:
                nums[k] = element
                k += 1

        return k
