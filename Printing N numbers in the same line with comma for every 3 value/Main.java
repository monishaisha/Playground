import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n=3;
    for(int i=1;i<=num;i++)
    {
     System.out.print(i); 
      if(i % n == 0 && n != num)
        System.out.print(",");
    }
  }
}