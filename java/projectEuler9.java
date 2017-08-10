
public class projectEuler9 {
	/*
	 * Solved by Euclid's formula of  "Pythagorean triple".
	 */
	public static void main(String[] args)
	{		
		int a=1;
		int b=1;
		int c=1;
		
		for (int y=1;y<=99;y++)
		{
			for (int i=2;i<=100;i++)
				{
				if (i>y)
				{
					a = (i*i) - (y*y);
					b = (2*i*y);
					c = ((i*i)+(y*y));
					if(a+b+c == 1000)
						{
							System.out.println("a:"+a+", b:"+b+", c:"+c);
							System.out.println("Answer: "+a*b*c);
							break;
						}
				}
				}
		}
	}
}