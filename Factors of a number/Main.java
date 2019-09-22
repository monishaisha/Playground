import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
          int factor,count=1;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    while(count <= num)
    {
        factor = num % count;
        if(factor == 0)
        System.out.println(count);
        count++;
    }

	}
}