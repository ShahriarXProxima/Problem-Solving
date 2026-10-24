class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        profit = 0
        min_idx = 0
        max_idx = 0

        for i in range(1, len(prices)):
            if prices[i] < prices[min_idx]:
                min_idx = i
                max_idx = i
            elif prices[i] > prices[max_idx]:
                max_idx = i

            profit = max(profit, prices[max_idx] - prices[min_idx])

        return profit
