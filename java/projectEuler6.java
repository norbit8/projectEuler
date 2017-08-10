public class projectEuler6 {
	public static void main (String[] args)
	{
		long sumOfSquares=0;
		long SquareOfsums=0;
		for (int i=1;i<=100;i++)
		{
			sumOfSquares+=i*i;
		}
		for (int i=1;i<=100;i++)
		{
			SquareOfsums+=i;
		}
		System.out.println(SquareOfsums*SquareOfsums - sumOfSquares);
	}
}
