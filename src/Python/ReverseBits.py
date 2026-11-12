class Solution:
    def reverseBits(self, n: int) -> int:
        binary_str = bin(n)[2:].zfill(32)

        binary_str = "".join(reversed(binary_str))

        return int(binary_str, 2)