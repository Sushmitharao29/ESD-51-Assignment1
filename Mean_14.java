/* Implement a JAVA program to find the Mean of given 5 numbers */

public class Mean_14
{
	public static void main(String args[])
	{
      float mean;
      int sum, i;
      int n = 5;
	  
      int a[] = {3,56,6,4,3};
      sum = 0;

      for(i = 0; i < n; i++) 
	  {
         sum += a[i];
      }
	  
      System.out.println("Mean ::"+ sum/(float)n);
	}
}
 