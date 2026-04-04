class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = float('inf')   # 目前看過的最低股價
        maxProfit = 0          # 最大利潤
        
        for price in prices:
            if price < minPrice:
                minPrice = price
            elif price - minPrice > maxProfit:
                maxProfit = price - minPrice
        return maxProfit


























        for price in prices:
            # 如果發現更低的價格，就更新 min_price
            if price < min_price:
                min_price = price
            # 否則計算當天賣出的利潤
            elif price - min_price > max_profit:
                max_profit = price - min_price

        return max_profit