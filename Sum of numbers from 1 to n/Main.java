import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
       int sum = 0;
      for(int count= 1;count<=num;count++)
      {
          
          sum = sum+count;
         
      }
       System.out.println(sum);
	}
}