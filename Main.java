import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner scn = new Scanner (System.in);
		int size = scn.nextInt();
		int arr[][] = new int [size][size];
		
		int r1=0, r2=size-1;
		int c1=0, c2=size-1;
		int dir=0;
		int count=1;
	
	while (r1<=r2 && c1<=c2){	
		
		if (dir==0)
		{
		    for (int i=r1 ; i<=c2 ; i++)
		    {
		        
		        //System.out.println(r1 +" ,1 "+i);
		        arr[r1][i]=count;
		        count++;
		        
		    }
		    r1+=1;
		    
		    dir=1;
		}
		
			if (dir==1)
		{
		    for (int i=r1 ; i<=r2 ; i++)
		    {
		        
		        //System.out.println(i +" ,2 "+c2);
		        arr[i][c2]=count;
		        count++;
		        
		    }
		    c2-=1;
		    dir=2;
		}
		
		if (dir==2)
		{
		    
		    for (int i = c2 ; i >= c1 ; i--)
		    {
		        
		        //System.out.println( c2+1 +" ,3 "+i);
		        arr[c2+1][i]=count;
		        count++;
		        
		    }
		    r2-=1;
		    dir=3;
		}
		if (dir==3)
		{
		    
		    for (int i = r2 ; i >= r1 ; i--)
		    {
		        
		        //System.out.println( i +" ,4 "+c1);
		        arr[i][c1]=count;
		        count++;
		        
		    }
		    c1+=1;
		    dir=0;
		}
		 
	} 
	
	for(int i = 0 ;i<size;i++)
	{

        for (int j=0;j<size;j++)
        {
             System.out.print(arr[i][j]);
        }
        System.out.println();
    }
	
	
}

}
