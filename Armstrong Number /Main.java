import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    int temp = num;
    int c = 0;
    
    while (num != 0)
    {
        int a = num%10;
        num = num/10;
        c = c + (a*a*a);
        
    }
    
    
    
    if(c == temp)
    System.out.println("Armstrong Number");
    else
    System.out.println("Not a Armstrong Number");
    
	}
}