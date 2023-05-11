import java.util.Scanner;

class Cop1
{
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) 
	{
		

		System.out.println("enter a value:");
		int a= s.nextInt();

		if(a>0)
		{
			if(a%2==0)
			{

		 
			    System.out.println("number is +ve even  "+ a);

		}
		else
		{
			System.out.println("number +ve odd  "+a);
		}

		}

		else
		{
			if(a%2==0)
			{
				System.out.println("number -ve even  "+a);
				
			}
			else{
				System.out.println("number -ve odd  "+a);
			}
		}
	}
}
