/* 
Given a positive integer N, find the sum of all prime numbers between 1 and N(inclusive).
 

Example 1:

Input: N = 5
Output: 10
Explanation: 2, 3, and 5 are prime
numbers between 1 and 5(inclusive).
Example 2:

Input: N = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime
numbers between 1 and 10(inclusive).
*/

class SumOfPrime
{
    public long prime_Sum(int n)
    {
        // code here
        long sum = 0;
        for(long i = 1; i <= n; i++)
        {
            if(isPrime(i)){
                sum = sum + i;
            }
        }
        return sum;
        
    }
    
    public static boolean isPrime(long n)
    {
        if(n <= 1)
            return false;
        else if(n == 2)
            return true;
        else if(n%2 == 0)
            return false;
        
        for(long i = 3; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        
        return true;
    }
}
