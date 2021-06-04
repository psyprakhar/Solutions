import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine().toLowerCase();
		String s2=br.readLine().toLowerCase();
		int compare=s1.compareTo(s2);
		if(compare==0)
			System.out.println(0);
		else if(compare<0)
			System.out.println(-1);
		else
			System.out.println(1);
	}
} 