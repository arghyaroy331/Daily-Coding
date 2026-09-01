class Solution {
    public boolean isHappy(int n) {
        int slow = n , fast = n;
        while(fast != 1){
            slow = funC(slow);
            fast = funC(fast);
            fast = funC(fast);
            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
        
    }
    public static int funC(int n){
        //int totsum = 0;
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += d * d;
             n = n /10;
            //totsum = sum + n * n;
        }
        return sum;
    }
    
}