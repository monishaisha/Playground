import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();      
       int curr_row,curr_col,nums=0;
   
      for( curr_row = 1;curr_row <= num;curr_row++)
      {
       for( curr_col = 1;curr_col <= curr_row;curr_col++) 
       {
        nums = nums + 1;
        if(nums % 2 == 1)
        System.out.print("*");
        else
        System.out.print("#");
       }
        System.out.print("\n"); 
      }


   
    }
}