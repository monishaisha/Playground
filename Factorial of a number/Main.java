import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int fact = 1;
    
    while(num > 0)
    {
        fact = fact * num;
        num--;
    }
    System.out.println(fact);
	}
}