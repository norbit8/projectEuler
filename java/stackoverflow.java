import java.util.ArrayList;

public class stackoverflow {
public static void main(String[] args)
{
	String[] str="NAME SURNAME NUMBER @2131231313".split("");
	ArrayList<String> newstr = new ArrayList<String>();
	
	for (int i=0;i<str.length;i++)
	{
		if (!str[i].equals("@")) {
			newstr.add(str[i]);
		}
		
		else break;
		
	}
	System.out.println(newstr);
}
}
