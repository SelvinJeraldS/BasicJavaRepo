import java.util.*;  
import java.io.*;  
/*public class Xylem  
{  
 public static void main(String args[])  
 {  
    // the sum of extreme digits is stored in the variable extreme_sum
   // the sum of mean digits is stored in the variable mean_sum
   int num, extremeD_sum = 0, meanD_sum = 0, num1;   
   Scanner sc= new Scanner (System.in);  
   System.out.print("Enter any number: ");  


  //reads an integer from the user  
  num = sc.nextInt();  


  // the absolute value of the given number is found out 
  num = Math.abs(num);  


  //the entered number is copied into variable num1  
  num1 = num;  


  //the while loop executes until the given condition becomes false  
  while(num1 != 0)  
  {  
     //If one of the conditions is true, the statement is considered true
     if(num1 == num || num1 < 10)  


     //The last digit is found out and added to the variable extreme_sum  
        extremeD_sum = extremeD_sum + num1 % 10;  


     else  
       //The sum of mean digits is found and added to the variable mean_sum  
        meanD_sum = meanD_sum + num1 % 10;  


      //The last digit from the number is removed
      num1 = num1 / 10;  
   }  
     System.out.println("The sum of extreme digits are " + extremeD_sum );  
     System.out.println("The sum of mean digits are " + meanD_sum);  


     // The sum of extreme digits is compared with the sum of mean digits  
     if(extremeD_sum  == meanD_sum)  


    //displays if sums are equal  
    System.out.println(num + " is a xylem number.");  


    else  
     //displays if the sum is not equal  
     System.out.println(num + " is a phloem number.");  
 }  
} */

public class Xylem
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String [] args){
		System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int temp=n;
	int outer_sum=0;
    int inner_sum=0;
	while(temp!=0){
		if(temp==n || temp<10)
			outer_sum=outer_sum+temp%10;
		else
			inner_sum=inner_sum+temp%10;
		    temp=temp/10;
			}
		
	
	if(outer_sum == inner_sum)
		System.out.println(n+" is a Xylem number");
    else
		System.out.println(n+" is a Pheolem number");
	 
  }
}