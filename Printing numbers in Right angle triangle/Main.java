import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      for(int curr_row = 1;curr_row <= num;curr_row++)
      {
       for(int curr_col = 1;curr_col <= curr_row;curr_col++) 
       {
         System.out.print(curr_row);
         
       }
        System.out.print("\n");
      }
	}
}