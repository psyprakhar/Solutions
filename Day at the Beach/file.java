import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] toarr=br.readLine().split("\\s");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(toarr[i]);
		}


		int[] leftMax=new int[n+1];
		int[] rightMin=new int[n+1];
		leftMax[0]=Integer.MIN_VALUE;
		rightMin[n]=Integer.MAX_VALUE;

		for(int i=1;i<=n;i++)
		{
			leftMax[i]=Math.max(leftMax[i-1],arr[i-1]);
		}


		for(int i=n-1;i>=0;i--)
		{
			rightMin[i]=Math.min(rightMin[i+1],arr[i]);
		}

		int partition=1;
		for(int i=1;i<n;i++)
		{
			if(leftMax[i]<=rightMin[i])
				partition++;
		}

		System.out.print(partition);

	}
}