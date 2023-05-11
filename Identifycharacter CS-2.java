import java.util.Scanner;
class Identifycharacter 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.println("Enter a character");
		char ch = s.next().charAt(0);

		if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z')
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'|| ch=='o'||ch=='i'||ch=='u'||ch=='e')
			{
				System.out.println("Enter a number:");
				int num = s.nextInt();

				if(num%2==0)
				{
					System.out.println("Java");
				}
				else
				{
					System.out.println("Sql");
				}
			}
		

		else 
		{
			System.out.println("Enter a number");
			int num = s.nextInt();
			if(num>0)
			{
				System.out.println("J2EE");
			}
			else
			{
				System.out.println("JDBC");

			}

		}

		
		}

	 else if(ch>='0' && ch<='9')
		{
			System.out.println("Your entering the number");
		}
		
		
			
		

	}

}
