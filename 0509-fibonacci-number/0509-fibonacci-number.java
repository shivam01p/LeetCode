class Solution {
    public int fib(int n) {
        // Base case
        if(n == 0 || n == 1){
            return n;
        }

        // Recursion
        return fib(n-2) + fib(n-1);
    }
}