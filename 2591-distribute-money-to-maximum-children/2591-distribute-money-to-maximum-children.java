class Solution {
    public int distMoney(int money, int children) {
        
        if(money < children)    // Satisfying first condition
            return -1;
        
        money-=children;       // Satisfying second cndition
        
        int res = 0;
        while(money>=7 && children>0){
            money-=7;
            res++;
            children--;
        }
        
        //  In above case each child wnats $7 to have $8, distributing it using while loop.
        
        
        if(res == 0)
            return res;
        
        else{
            if(children == 0 && money > 0)
                res -= 1;
                
            // Each child having $8 with them & money is still remaining it violates Condition . So (res-=1) balance the money to last child.
                
                
                
            if(children == 1 && money == 3)
                res -= 1;
                
            // Above 1 child having $1 while other have $8, if (money==3) make $4 with child. which violates condition-3, so (res-=1) balance the money between 2 children;
        }
        
        return res;
        
    }
}