package recursion.easy;

public class Nto1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(8);
	}
	static void fun(int n)
	{
		if(n == 0)
			return;
		//fun(n-1);
		
		fun(n-1);
		System.out.println(n);
	}
}