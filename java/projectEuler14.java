// project euler ex14
// yoav levy
public class projectEuler14 {
	public static void main(String[] args)
	{
		long saver =0;
		long max = 0;
		long counter = 0;
		long x;
		long[] a = new long[9999999];
		for (int i=2;i<999999;i++)
		{
			x = i;
			counter = 0;
			while (x!=1)
			{
				if (x<999999)
						{
				if (a[(int) x]==0)
				{
				x = analayze(x);
				counter ++;
				}
				else
				{
					counter += a[(int) x];
					break;
				}
						}
				else
				{
					x = analayze(x);
					counter ++;
				}
			}
			if (counter>max)
			{
				max = counter;
				saver = i;
			}
			a[i]= counter;
		}
		System.out.println(max+" "+saver);
		
	}
	public static long analayze(long x)
	{
		if (x%2==0)
		{
			x = x/2;
		}
		else x = ((x*3) +1);
		return x;
	}
}
