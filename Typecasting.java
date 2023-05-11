class Test1 
{
	public static void main(String[] args) 
	{
		byte a=14;
		short b = (short) a;
		int c=(int) a;
		System.out.println(b);
	}
}
 class Test2

 {
	 public static void main(String [] args)
	 {
		Test1.main(args);
		int a=123;
		long res = (long) a;
		System.out.println(res);
	 }

 }
