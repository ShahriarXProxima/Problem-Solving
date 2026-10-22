class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        str_list = list(s.split())

        return len(str_list[len(str_list) - 1])
