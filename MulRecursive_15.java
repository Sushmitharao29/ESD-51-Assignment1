/*  Implement a JAVA program to multiply two numbers using recursive multiplication */

class MulRecursive_15
{
	double product(double x, double y)
	{
		if(y == 0)
		{
			return 0;
		}
		else
		{
			return (x + product(x, y - 1));
		}	
	}
	
	public static void main(String args[])
	{
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		
		MulRecursive_15 obj = new MulRecursive_15();
		
		System.out.println("product is : "+obj.product(num1,num2));
	}
}
