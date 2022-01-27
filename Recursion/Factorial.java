package recursion.easy;

public class Factorial {
	static int fact(int n)
	{
		if(n == 1)
			return 1;
		//System.out.println(n);
		return n * fact(n-1);
	}
	
	static void printN(int n)
	{
		if(n == 0)
			return;
		System.out.println(n);
		printN(--n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printN(5);
	}

}
