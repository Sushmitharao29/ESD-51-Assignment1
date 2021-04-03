/* Implement Java program to check if a given number is Fibonacci number or not */

import java.util.Scanner;              
 
public class FibonacciSeries_21 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter positive number :");
        int num = sc.nextInt();
         
        int num1 = 0;        
        int num2 = 1;         
        int num3 = 0;
         
        while (num3 < num)
        {
            num3 = num1 + num2;             
            num1 = num2;             
            num2 = num3;
        }
         
        if(num3 == num)      
            System.out.println("Number belongs to Fibonacci series");
        else
			System.out.println("Number doesn't belongs to Fibonacci series");
    }   
}