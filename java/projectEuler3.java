import java.util.*;
import java.lang.Integer;


public class projectEuler3
{
	public static void main (String[] args)
	{
		int number =(int) Math.sqrt(600851475143L);
		List<Integer> a1 = new ArrayList<Integer>();
		for (int i=2;i<=number;i++)
		{
			if (isPrime(i))
			{
			a1.add(i);
			}
		}
		for (int i=0;i<a1.size();i++)
		{
			if (600851475143L%a1.get(i)==0)
			{
			System.out.println(a1.get(i));
			}
		}

	}
	//checks whether a long is prime or not.
	 static boolean isPrime(long n) {
	     for(long i=2;i*i<n;i++) 
	     {
	         if(n%i==0)
	             return false;
	     }
	     return true;
	 }
}
