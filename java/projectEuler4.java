import java.lang.Integer;
public class projectEuler4 {
	public static void main(String[] args)
	{
		int i;
		int z;
		int bigger = 0;
		for (i=100;i<=999;i++)
		{
			for (z=100;z<=999;z++)
			{
				if (isPalindrome(i*z) && i*z>bigger)
				{
					bigger = i*z;
				}
			}
		}
		System.out.println(bigger);
	}
	public static boolean isPalindrome(int number)
	{
		int temp = number;
		if (new StringBuilder(Integer.toString(number)).reverse().toString().equals(Integer.toString(temp)))
				{
					return true;
				}
		return false;
	}
}
