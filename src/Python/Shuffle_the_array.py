class Solution:
    def shuffle(self, nums: list[int], n: int) -> list[int]:
        shuffled_list = []

        i = 0
        j = n
        while j < 2 * n:
            shuffled_list.append(nums[i])
            shuffled_list.append(nums[j])
            i += 1
            j += 1

        return shuffled_list
