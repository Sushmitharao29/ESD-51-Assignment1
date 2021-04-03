/* Implement a java program to find the LCD of the given numbers */

class Lcd_50 
{
	int Lcd(int num1, int num2)
	{
		int i = 1 , j = 1;
		int temp1 = num1;
		int temp2 = num2;
		
		while(num1 != num2)
		{			
			if(num2 > num1)
			{
				num1 = temp1 * i;
				i++;
				//System.out.println("num1 "+num1);
			}
			if (num1 > num2)
			{
				num2 = temp2 * j;
				j++;
				//System.out.println("num2 "+num2);
			}			
		}
		return num2;
	}
	
	public static void main(String args[])
	{
		Lcd_50 obj = new Lcd_50();
		int num1 = 5;
		int denom1 = 6;
		int num2 = 3;
		int denom2 = 7;
		System.out.println("Lcd of fractions : "+obj.Lcd(denom1, denom2));	
	}
}