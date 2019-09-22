import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int reverse = 0;
    int remain;
    while(num !=0) {
      remain = num%10;
      reverse = reverse*10+remain;
      num = num/10;
      }
    System.out.println(reverse);
}
}