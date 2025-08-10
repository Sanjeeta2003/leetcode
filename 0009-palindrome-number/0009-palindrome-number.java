class Solution {
    public boolean isPalindrome(int x) {
        int xo=x,xN=0;
        int rev = 0;
        while (x > 0)
        {
            int r = x%10;
            xN= xN*10+r;
            x=x/10;
            
        }
        if(xo == xN)
        return true;
        else
        return false;
    }
}