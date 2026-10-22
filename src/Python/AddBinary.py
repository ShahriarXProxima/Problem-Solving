
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a) - 1
        j = len(b) - 1

        result = ""
        carry = 0

        while i >= 0 or j >= 0:
            x = int(a[i]) if i >= 0 else 0
            y = int(b[j]) if j >= 0 else 0

            total = x + y + carry

            if total == 0:
                result = "0" + result
                carry = 0
            elif total == 1:
                result = "1" + result
                carry = 0
            elif total == 2:
                result = "0" + result
                carry = 1
            else:
                result = "1" + result
                carry = 1

            i -= 1
            j -= 1

        if carry:
            result = "1" + result

        return result
