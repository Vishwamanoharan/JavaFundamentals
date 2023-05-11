import java.util.Scanner;
class Bold 

{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.println("Enter your scanner code");
		int code=scanner.nextInt();
		System.out.println("Enter a code  " + code);
		System.out.println("Enter the name");
		char ch=scanner.next().charAt(0);
		System.out.println("Display a char  "+ch);
		
		

	}
}
