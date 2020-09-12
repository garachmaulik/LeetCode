class Solution_509_FibonacciNumber {
    public int fib(int N) 
    {   
        int fibonacci = 0;
        if(N > 1)
        {
            fibonacci = fib(N-1) + fib(N-2);
        }
        if(N == 0)
            fibonacci = 0;
        if(N == 1)
            fibonacci = 1;
        return fibonacci;
    }
}
