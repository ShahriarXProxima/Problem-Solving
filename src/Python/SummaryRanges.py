class Solution:
    def summaryRanges(self, nums: list[int]) -> list[str]:
        range_list = []

        if len(nums) == 0:
            return range_list

        i = 0
        j = 0

        while j < len(nums) - 1:
            if nums[j] != nums[j + 1] - 1:
                if i == j:
                    s = str(nums[i])
                else:
                    s = str(nums[i]) + "->" + str(nums[j])

                range_list.append(s)
                i = j + 1

            j += 1

        if i == j:
            s = str(nums[i])
        else:
            s = str(nums[i]) + "->" + str(nums[j])

        range_list.append(s)

        return range_list