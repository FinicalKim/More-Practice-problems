
public class program4 {
	
	
	public static void main(String[] args)
	{
	int i = 10;
	int j = 20;
		
	Program3.add(i, j);
	
	Program3 aa = new Program3();
	aa.sub();
		
	var x = new program4();
	x.sub(i, j);

	}
	
	
	
	public static int sub( int num1, int num2 )
	{
	
		int sub = num1 - num2;
		System.out.println(sub);
	return sub;
	}
	
	public  int div( int num1, int num2 )
	{
	
		int sub = num1 / num2;
		System.out.println(sub);
	return sub;
	
	}
}
