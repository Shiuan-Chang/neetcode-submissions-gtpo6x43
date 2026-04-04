class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        minPrice = float('inf')

        for price in prices:

            if price < minPrice:
                minPrice = price
            
            if  price - minPrice > maxProfit:
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