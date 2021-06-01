import java.util.*;
import java.io.*;
public class file
{
	

	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		if(n>2)
		{
			if(n%2==0)
				System.out.print("YES");
			else
				System.out.print("NO");
		}
		else{
			System.out.print("NO");
		}
	}
		 
}