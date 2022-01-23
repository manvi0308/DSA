/* 
Given the mobile numeric keypad. You can only press buttons that are up, left, right, or down to the current button. 
You are not allowed to press bottom row corner buttons (i.e. * and # ). Given a number N, the task is to find out the 
number of possible numbers of the given length.

Example 1:

Input: 1
Output: 10
Explanation: Number of possible numbers 
would be 10 (0, 1, 2, 3, …., 9)  
Example 2:
Input: N = 2
Output: 36
Explanation: Possible numbers: 00, 08, 11,
12, 14, 22, 21, 23, 25 and so on.
If we start with 0, valid numbers 
will be 00, 08 (count: 2)
If we start with 1, valid numbers 
will be 11, 12, 14 (count: 3)
If we start with 2, valid numbers 
will be 22, 21, 23,25 (count: 4)
If we start with 3, valid numbers 
will be 33, 32, 36 (count: 3)
If we start with 4, valid numbers 
will be 44,41,45,47 (count: 4)
If we start with 5, valid numbers 
will be 55,54,52,56,58 (count: 5) 
and so on..
*/
//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
    char[] a = {'2','2','2','3','3','3','4','4','4','5','5','5','6','6','6','7','7','7','7','8','8','8','9','9','9','9'};
    String res="";
    for(int i = 0; i < n; i++)
    {
        res = res + a[s.charAt(i) - 'a'];
    }
    
    return res;
}
