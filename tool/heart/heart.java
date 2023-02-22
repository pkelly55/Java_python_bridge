public class heart
{
    public static void main(String[] args)
    {
             
	
	int rows= Integer.parseInt(args[0]);	 
  
 
	for(int i=rows;i>0 ;i--)
               {
	        for(int j=0;j<rows-i;j++)
                
                       {System.out.print(" ");
                       }for(int j=0;j<(i*2)-1;j++)
                
                       {System.out.print("*");
                       }System.out.println();
               }                          
    }
}