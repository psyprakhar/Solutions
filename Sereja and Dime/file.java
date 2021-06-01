import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] ar=br.readLine().split("\\s");
		int[] arr=new int[ar.length];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(ar[i]);
		}

		boolean flag=true;
		int left=0,right=arr.length-1,s=0,d=0;
		while(left<=right)
		{
			if(flag)
			{

				if(arr[left]>=arr[right])
				{
					s+=arr[left];
					left++;
				}
				else
				{
					s+=arr[right];
					right--;
				}
				flag=!flag;
			}
			else 	
			{
				if(arr[left]>=arr[right])
				{
					d+=arr[left];
					left++;
				}
				else
				{
					d+=arr[right];
					right--;
				}
				flag=!flag;
			}
		}

		System.out.print(s+" "+d);
	}
}