import java.util.Random;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 6;
		int j = 55;
		
		int k = add(i, j);   // create variable to accept calling of variable sum
		
		int l = program4.sub(i, j); //calls the method sub from class program4 also sends values from i and j
		
		var t = new program4();
		t.div(i, j);
		
		int p = Math.abs(l);
		
		double w = Math.pow(l, 6);
		    System.out.println(w);
		    System.out.println(p);
		    System.out.println(k);
		
		program4 aa;   //creates an object type program4 and can access non static methods inside program 4
		
		
		String bb = ("Hello CSC110");
		    System.out.println(bb.charAt(4));
		    System.out.println(bb.toUpperCase());
		
		   
		    
		    
		    
	}
    public static int add( int num1, int num2 )
		{
		
			int sum = num1 + num2;
			System.out.println(sum - 1);
		return sum;
		
		}
		
	//test to get a return value(remove void and place return then variable)

    public void sub()
	{
	
		System.out.println("Hello");
	
	}
	
}
