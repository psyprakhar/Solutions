import java.util.*;
import java.io.*;
public class file
{
	static long val=1000000000100l;


	static long hamburgers(String input, int nb,int nc,int ns,int pb,int pc,int ps,long price)
	{
		long s=0,e=val;
		long ans=-1;
		int cb=0,cc=0,cs=0;



		//1 hamburger banane ke liye kitne bread, kitne sausage , kitne cheese chahiye;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='B')
				cb++;
			else if(input.charAt(i)=='S')
				cs++;
			else
				cc++;
		}


		while(s<=e)
		{
			long mid=(s+e)/2;//middle amount ke hamburgers banane ke liye kitne rubles lagenge
			long bread = (cb*mid-nb)*pb<0?0:(cb*mid-nb)*pb;
			long sausage=(cs*mid-ns)*ps<0?0:(cs*mid-ns)*ps;
			long cheese=(cc*mid-nc)*pc<0?0:(cc*mid-nc)*pc;

			long checkPrice=bread+sausage+cheese;

			if(price==checkPrice){
				return mid;
			}
			else if(checkPrice<price)
			{
				s=mid+1;
				ans=mid;
			}
			else
			{
				e=mid-1;
			}
		}
		return ans;
	}





	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int nb,nc,ns;
		String[] str1=br.readLine().split("\\s");
		int pb,pc,ps;
		nb=Integer.parseInt(str1[0]);
		ns=Integer.parseInt(str1[1]);
		nc=Integer.parseInt(str1[2]);
		String[] str2=br.readLine().split("\\s");

		pb=Integer.parseInt(str2[0]);
		ps=Integer.parseInt(str2[1]);
		pc=Integer.parseInt(str2[2]);
		

		long price=Long.parseLong(br.readLine());


		System.out.print(hamburgers(str,nb,nc,ns,pb,pc,ps,price));
	}
}