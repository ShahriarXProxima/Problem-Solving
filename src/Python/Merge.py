class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        for i in range(0, n):
            nums1.pop()

        for element in nums2:
            nums1.append(element)

        nums1 = nums1.sort()
