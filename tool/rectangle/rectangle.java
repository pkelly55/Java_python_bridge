import java.lang.Math;

public class rectangle {
	public static void main(String[] args) 
	{
		int rows, columns, i, j;
		
		rows = Math.round(Integer.parseInt(args[0])/2);
		
		columns = rows*4;		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("*  "); 
			}
			System.out.print("\n"); 
		}	
	}
}