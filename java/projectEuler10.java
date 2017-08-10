
public class projectEuler10 {
	public static void main(String[] args)
	{
		long sum=2;
		for (int i=3;i<2000000;i+=2)
		{
			if (isPrime(i))
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}
	//checks whether an long is prime or not.
	public static boolean isPrime(int n) {
	     for(int i=2;i*i<=n;i++) 
	     {
	         if(n%i==0)
	             return false;
	     }
	     return true;
	 }
}