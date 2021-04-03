/* Implement a Java program to create the first twenty Hamming numbers */

class HammingNum_37
{
	public static void main(String args[])
	{
		int num = 2, NumCopy;
		int count = 0;
		System.out.println("Hamming numbers");
		System.out.println(1);
		
		while(count < 20)
		{
			NumCopy = num;
			while(num % 2 == 0)
			{
				num = num / 2;
			}
			while(num % 3 == 0)
			{
				num = num / 3;
			}
			while(num % 5 == 0)
			{
				num = num / 5;
			}
			if( num == 1)
			{
				System.out.println(NumCopy);
				count++;
			}			
			num = NumCopy;
			num++;
		}			
	}
}