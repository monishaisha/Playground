import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
   
      int last = n%10;
      int num = n;
    while ( num >=10)
    {
      num=num/10; 
    }
      int sum=   num+last;
      System.out.println(sum);
      
	}
}