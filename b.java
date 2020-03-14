
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void calculate(int N,char[][] grid)
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0 ; i < N ; i++ )
		    {
		        for(int j = 0 ; j < N ; j++ )
		        {
		            if( grid[i][j] != '.')
		            {
						x.add(i);
						y.add(j);
		            }
		        }
		    }
			GFG.getCount(x,y);
    }
	public static void getCount(ArrayList<Integer> x,ArrayList<Integer> y)
    {
		int count = 0;
         for(int i = 0 ; i < x.size() - 2; i++ )
		    {
		        for(int j = i+1 ; j < x.size()  - 1 ; j++ )
		        {
		          for(int k = j+1 ; k < x.size() ; k++ )
					{
						int x1 = x.get(i);
						int x2 = x.get(j);
						int x3 = x.get(k);
						
						int y1 = y.get(i);
						int y2 = y.get(j);
						int y3 = y.get(k);
						if( ( x1 *(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)) == 0)
							count++;
					}  
		        }
		    }
			System.out.println(count);
    }
    
	public static void main (String[] args) throws Exception
	{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(buff.readLine());
		while(T!=0)
		{
		    int N = Integer.parseInt(buff.readLine());
		    char[][] grid = new char[N][N];
		    for(int i = 0 ; i < N ; i++ )
		    {
				String s = buff.readLine();
				char[] c = s.toCharArray();
		        for(int j = 0 ; j < c.length ; j++ )
		        {
		            grid[i][j] = c[j];
		        }
		    }
		    GFG.calculate(N,grid);
			T--;
		}
		
	}
}

