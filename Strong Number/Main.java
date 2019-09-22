import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
    int sum,temp,first,second,seconds,third,fact_first=1,fact_second=1,fact_third=1;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();  
    
    temp = num;
    first = num / 100;
    while(first > 0)
    {
    
        fact_first = fact_first * first;
        first--;
    }
    second = num/10;
    seconds = second % 10; 
    while(seconds > 0)
    {
        
        fact_second = fact_second * seconds;
        seconds--;
    }
    third = num % 10;
     while(third > 0)
    {
    
        fact_third = fact_third * third;
        third--;
    }
    sum = fact_first+fact_second+fact_third;
    
    if(sum == temp)
    System.out.println("Yes");
    else
    System.out.println("No");
	}
}