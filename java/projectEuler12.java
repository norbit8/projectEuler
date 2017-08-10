
public class projectEuler12 {
	public static void main(String[] args)
	{
		int number=28;
		int plus= 8;
		while (true)
		{
			number = number+plus;
			if (howManyDivisors(number)>500)
			{
				System.out.println(number);
				break;
			}
			plus++;
		}
		
	}
	
	static int howManyDivisors(int n)
	{
		int counter=0;
		for (int i=1;i*i<=n;i++)
		{
			if (n%i==0)
			{
				counter++;
			}
		}
		return counter*2;
	}
}

