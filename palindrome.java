import java.util.*; 
class palindrome
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		long num= sc.nextInt();
	    long rev_num=0;
		long Org_num=num;
		while(num!=0){
			rev_num= rev_num*10 + num%10;
			num=num/10;}

		if(Org_num==rev_num){
			System.out.println(Org_num+"   is palindrome   "+rev_num);			
		
		}else
			System.out.println(Org_num+"    not palindrome   " +rev_num);
		
	}
}
