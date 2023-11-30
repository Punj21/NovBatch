package package1;

public class Arithmetic1 
{
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		return c;		
	}
	public int substract(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int sum(int m, int n) 
	{
		int o;
		o=m+n;
		return o;		
	}
	public void division(int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Final Result after division is "+l);
				
	}
	public static void main(String[] args) 
	{
		Arithmetic1 shubh=new Arithmetic1 ();
		int MultiResult=shubh.multi(10, 2);
		System.out.println("Result of Multiply is "+MultiResult);
		int SubsResult1=shubh.substract(MultiResult, 2);
		System.out.println("Result of Substraction1 is "+SubsResult1);
		int SumResult=shubh.sum(SubsResult1, 2);
		System.out.println("Result of Sum is "+SumResult);
		int SubsResult2=shubh.substract(SumResult, 2);
		System.out.println("Result of Substraction2 is "+SubsResult2);
		shubh.division(SubsResult2, 2);
	}
}
