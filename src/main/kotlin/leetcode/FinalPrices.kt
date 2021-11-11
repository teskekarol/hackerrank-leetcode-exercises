package leetcode

import java.util.Stack

class FinalPrices {
    fun finalPrices(prices: IntArray): IntArray {

        val stack = Stack<Int>()

        for(i in prices.indices) {

            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]){
                prices[stack.pop()]-= prices[i]
            }
            stack.push(i)
        }

        return prices
    }
}
