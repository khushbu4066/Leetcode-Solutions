class Solution:
    def divide(self, dividend, divisor):
        if dividend == -1<<31 and divisor == -1: return (1<<31)-1

        a, b = abs(dividend), abs(divisor)
        sign = (dividend < 0) == (divisor < 0)
        res, cand = 0, [(1, b)]
        
        while b << 1 <= a:
            cand += [(cand[-1][0]<<1, b<<1)]
            b <<= 1
            
        for pw, num in cand[::-1]:
            if a >= num:
                a, res = a - num, res + pw
                
        return res if sign else -res