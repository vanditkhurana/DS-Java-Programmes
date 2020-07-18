import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner obj=new Scanner(System.in);
      int i,j,temp;
      int n=obj.nextInt();
      int arr[]=new int[n];
      for(i=0;i<n;i++)
      {
          arr[i]=obj.nextInt();
      }
      boolean flag;
      for (i = 0; i < n-1; i++) 
      { 
        flag = false; 
        for (j = 0; j < n-i-1; j++) 
        { 
            if (arr[j] > arr[j+1]) 
            { 
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag = true; 
            } 
        } 
        if (flag == false)
        {
            break;
        }
      }
      for(i=0;i<n;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
}