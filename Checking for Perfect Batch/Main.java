import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int arr_size=sc.nextInt();
    int list[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
    {
          list[i]=sc.nextInt();
    }
    sum_of_batch_3(list,arr_size);
  }
  
  public static void sum_of_batch_3(int list[],int arr_size)
  {
   boolean same_value=true;
    
   int batch_1=list[0]+list[1]+list[2];
      for(int i=3;i<=arr_size-1;i=i+3)
      {
        int curr_batch=list[i]+list[i+1]+list[i+2];       
      

    if(curr_batch != batch_1)
    {
      same_value=false;
    }
      }
    if(same_value==true)
    	System.out.println("Perfect Batch");
    else
      	System.out.println("Not a Perfect Batch");
   
  }
}