import java.lang.System;


public class Hello {
	
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        int i;
        int y;
        int sum;
        int z;
        int sum2;
        int temp;
        int[][] anArray;
        anArray = new int[10][9];
        sum=0;
        for (i=1;i<=10000;i++)
        { 
        sum = givemehalkim(i);
        sum2 = givemehalkim(sum);
        if (sum2 == i) 
        	{
        		System.out.println(i+","+sum);
        	}
        }
        
}
	 public static int givemehalkim (int i)
	 {
		 int y = 1;
		 int sum = 0;
		 for (y=1;y<i;y++)
		 {
    			if (i%y == 0 )
    			{	
    				sum += y; //  הסכום של המחלקים של אי
    			}
    		}
		 return sum;
	 }
	 
}