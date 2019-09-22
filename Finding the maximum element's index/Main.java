import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int list[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        list[i]=sc.nextInt();
	    }
	    int max_idx;
	    
	    if(list[0]>list[1])
	      max_idx=0;
	    else
	      max_idx=1;
	    
	    for(int i=2;i<=n-1;i++)
	    {
	        if(list[max_idx]<list[i])
	        {
	            max_idx=i;
	        }
	    }
		System.out.println(max_idx);
	}
}