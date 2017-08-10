import java.math.BigInteger;

public class projectEuler16
{
	public static void main(String[] args)
	{
		BigInteger result = new BigInteger("0");
		BigInteger b = new BigInteger("2");
		for(int i=0;i<=1000;i++)
		{
		b = b.multiply(new BigInteger("2"));
		}
		while(!b.equals(new BigInteger("0")))
		{
		result = result.add(b.mod(new BigInteger("10")));
		b = b.divide(new BigInteger("10"));
		}
		System.out.println(result);
	}
}