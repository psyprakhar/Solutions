import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='Y'||c=='y' )
			{
				continue;
			}
			else
			{
				if(c>=65 && c<=90)
				{
					sb.append('.');
					sb.append(String.valueOf(c).toLowerCase());
				}
				else
				{
					sb.append('.');
					sb.append(c);
				}
			}
		}
		System.out.print(new String(sb));
	}
}