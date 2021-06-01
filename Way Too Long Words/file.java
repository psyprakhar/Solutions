import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			if(s.length()>10)
			{
				String ans=String.valueOf(s.charAt(0))+String.valueOf(s.length()-2)+String.valueOf(s.charAt(s.length()-1));
				System.out.println(ans);
			}
			else
				System.out.println(s);
		}

	}
}