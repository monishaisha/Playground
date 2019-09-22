import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner (System.in);
      int num = sc.nextInt();
      int last_two = num%100;
      int result = last_two/10;
      System.out.println(result);
	}
}