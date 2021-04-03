/* Implement a Java program to calculate the Binomial Coefficient of two positive numbers */

class BinCoefficient_19
{

	static int binCoefficient(int n, int k)
	{
		if(k > n)
			return 0;
		if(k == 0 || k == n)
			return 1;
		
		return binCoefficient(n - 1, k - 1) + binCoefficient(n -1, k);
	
	}
	public static void main(String args[])
	{
		int n = 10, k = 2;
		
		System.out.printf("value of coefficient(%d, %d) is %d", n, k, binCoefficient(n, k));	
	}
}