class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        num = int("".join(str(x) for x in digits))
        num += 1

        num_list = [int(digit) for digit in str(num)]

        return num_list
