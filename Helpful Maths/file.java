import java.util.*;
import java.io.*;
public class file
{
	public static void main(String...args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] toArr=br.readLine().split("\\+");
		int[] arr=new int[toArr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(toArr[i]);
		}
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print("+");
		}
	}
} 