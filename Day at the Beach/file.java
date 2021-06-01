import java.util.*;
import java.io.*;
public class file
{
	

	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int nb,nc,ns;
		String[] str1=br.readLine().split("\\s");
		int pb,pc,ps;
		nb=Integer.parseInt(str1[0]);
		nc=Integer.parseInt(str1[1]);
		ns=Integer.parseInt(str1[2]);
		String[] str2=br.readLine().split("\\s");

		pb=Integer.parseInt(str2[0]);
		pc=Integer.parseInt(str2[1]);
		ps=Integer.parseInt(str2[2]);
		

		long price=Long.parseLong(br.readLine());


		System.out.print(hamburgers(str,nb,nc,ns,pb,pc,ps,price));
	}
}