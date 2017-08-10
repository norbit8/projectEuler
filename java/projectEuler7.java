
public class projectEuler7 {
	public static void main(String[] args)
	{
		int x = 3;
		int mone = 2;
		while (true)
		{
			if (isPrime(x))
			{
			if (mone == 10001)
			{
				System.out.println(x);
				break;
			}
			mone= mone+1;
			}
			x = x + 2;
		}
	}
	public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	 }
}
