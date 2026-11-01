from curses.ascii import isalpha


class Solution:
    def isPalindrome(self, s: str) -> bool:
        for char in s:
            if not char.isalnum():
                s = s.replace(char, "")

        s = s.lower()
        low = 0
        high = len(s) - 1

        while low <= high:
            if s[low] != s[high]:
                return False

            low += 1
            high -= 1

        return True
