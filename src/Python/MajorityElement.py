class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        frequency_map = dict()

        for num in nums:
            if num not in frequency_map:
                frequency_map[num] = 1
            else:
                frequency_map[num] += 1

        return max(frequency_map, key=frequency_map.get)
