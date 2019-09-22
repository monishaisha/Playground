import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
      int arr_elements[]=new int[arr_size];
      int i;
      for( i=0;i<arr_size;i++)
      {
        arr_elements[i]=sc.nextInt();
      }
      int search_elem_1 = sc.nextInt();
      int search_elem_2 = sc.nextInt();
      int ele1_idx = -1;
      int ele2_idx =  -1;
      for(i=0;i<arr_size;i++)
      {
        if(search_elem_1==arr_elements[i])
        {
          ele1_idx=i;
        }
        if(search_elem_2==arr_elements[i])
        {
          ele2_idx = i;
        }
    }
      
    
        System.out.println(ele1_idx);
     
        System.out.println(ele2_idx);
      
    }
}