// Factorial of large numbers
// https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1

import java.math.BigInteger;
import java.util.ArrayList;
public class Factorial{
    //& STORE IN BIGINTEGER
    //& CONVERT IT TO STRING
    //& ADD THE STRING TO ARRAYLIST

    static ArrayList<Integer> factorial(int N)
    {
        ArrayList<Integer> al = new ArrayList<>();
        //! STEP 1
        BigInteger fact = new BigInteger("1"); // fact = 1; for normal integers
        for(int i = 2; i < N; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i)); // fact = fact * i;
            // Note the explicit typecasting to BigInteger
        }

        //! STEP 2
        //^ Note that toString will return the decimal representation of BigInteger number
        String str = fact.toString();

        //! STEP 3
        for(int i = 0; i < str.length(); i++)
        {
            al.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        return al;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}