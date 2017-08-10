
public class projectEuler5 {
	// brute force....
	public static void main(String[] args)
	{
		int number = 21;
		while (true)
		{
			if (isEvenlyDivisibleBy1To20(number))
			{
				System.out.println(number);
				break;
			}
			number+=1;
		}
	}
	public static boolean isEvenlyDivisibleBy1To20(int number)
	{
		for (int i=1;i<=20;i++)
		{
			if (number%i != 0)
			{
				return false;
			}
		}
		return true;
	}
}
