/* check Armstrong number */

public class Armstrong
{
	public static void main (String  args[])
	{
		int num = 123, number, temp, result = 0;
		
		number = num;
		
		while(number != 0)
		{
			temp = number % 10;
            result = result + temp*temp*temp;
            number /= 10;
		}

		if(result == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}
}