import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int first_digit=num1/10;
      int last_digit=num1%10;
      int sum = first_digit+last_digit;
      System.out.println(sum);
   }
}