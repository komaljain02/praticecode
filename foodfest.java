import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
  public static int calculate(int N,int[] A)
    {
        int count=0;
        int i = 0;
        for(i=0;i<N;)
		{
			if(i==N)
			{
			   i=0;
			}
            if((A[i]-count)<=0)
            {
                return i+1;
            }
            count++;
            i++;
        }
        return 0; 
    }
    
	public static void main (String[] args) throws Exception
	{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(scan.readLine());
		while(T!=0)
		{
		    int N = Integer.parseInt(scan.readLine());
		    String[] s = scan.readLine().split(" ");
            int[] A = new int[N];
            for(int i=0;i<s.length;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
		    System.out.println(GFG.calculate(N,A));
		    T--;
		}
	}
}