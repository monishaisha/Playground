import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int num=n;
      for(int row=1;row<=n;row++)
      {
        
        for(int j=num;j>=1;j--)
        {
          
          System.out.print(j);
        }
        System.out.print("\n");
        num--;
      }
	}
}