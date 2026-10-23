from math import comb


class Solution:
    def climbStairs(self, n: int) -> int:
        total = 0

        for twos in range(n // 2 + 1):
            ones = n - 2 * twos
            moves = ones + twos

            total += comb(moves, twos)

        return total
