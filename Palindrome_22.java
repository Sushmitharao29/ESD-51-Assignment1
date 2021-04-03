/* Check whether the number is a palindrome number or not */

class Palindrome_22
{
    public static void main(String args[]) 
	{
		int num = 121, revNum = 0, remainder, Number;
        Number = num;      
        while( num != 0 )
        {
            remainder = num % 10;
            revNum = revNum * 10 + remainder;
            num  /= 10;
        }      
        if (Number == revNum)
            System.out.println(Number + " is a palindrome.");
        else
            System.out.println(Number + " is not a palindrome.");
    }
}