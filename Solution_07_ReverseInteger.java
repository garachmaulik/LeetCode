class Solution_07_ReverseInteger {
    public int reverse(int x)
    {
        long rev = 0;
        int remainder;
        if(x>0)
        {
            while(x!=0)
            {
                remainder = x%10;
                rev = rev*10 + remainder;
                x = x/10;
            }
        }
        else
        {
            x = x*-1;
            while(x!=0)
            {
                remainder = x%10;
                rev = rev*10 + remainder;
                x = x/10;
            }
            rev = rev*-1;
        }
        
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)rev;
    }
}
