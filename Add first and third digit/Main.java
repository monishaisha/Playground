import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num  = num1/100;
      int num2 = num1%10;
      int sum = num+num2;
      System.out.println(sum);
	}
}