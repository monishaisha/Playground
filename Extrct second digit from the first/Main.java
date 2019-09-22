import java.util.Scanner;

 class Main{
	
	public static void main(String[] args) 
	{
        int second_one,second,temp,num,count=0;

	    Scanner sc = new Scanner (System.in);
	   num = sc.nextInt();
	       
   
    temp = num;
    while(num != 0){

        num = num/10;
        count = count+1;
        
    }
   
    if(count == 2)
    {
        second = temp%10;
        System.out.println(second);
    }
    else
    {
        second = temp /1000;
        second_one = second % 10;
        System.out.println(second_one);
        
    }

   
	   
    
        
        
        
      }
	}
