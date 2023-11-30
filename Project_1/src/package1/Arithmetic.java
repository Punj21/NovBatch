package package1;

public class Arithmetic 
{
	public int sum(int a, int b) 
	{		
		int c;
		c=a+b;
		return c;			
	}	
	public int substract(int x, int y)
	{
		int z;
		z=x-y;
		return z;		
	}
	public int multiply(int a1, int b1)
	{
		int c1;
		c1 =a1*b1;
		return c1;		
	}
	public void division(int m, int n)
	{
		int o;
		o=m/n;
		System.out.println("Final Result after division is "+o);
		
	}
	public static void main(String[] args) {
		Arithmetic Deep = new Arithmetic ();
		int SumResult1=Deep.sum(10, 2);
		System.out.println("Result of Sum1 is "+SumResult1);
		int SumResult2=Deep.sum(SumResult1, 2);
		System.out.println("Result of Sum2 is "+SumResult2);
		int SubsResult=Deep.substract(SumResult2, 2);
		System.out.println("Result of Substraction is "+SubsResult);
		int MultiResult= Deep.multiply(SubsResult, 2);
		System.out.println("Result of Multiplication is "+MultiResult);
		Deep.division(MultiResult,2);	
		
		
		
	}

}
