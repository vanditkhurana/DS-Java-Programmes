import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner obj=new Scanner(System.in);
      int i;
      int n=obj.nextInt();
      int a[] = new int[n];
      int ele=obj.nextInt();
      for(i=0;i<n;i++)
      {
          a[i]=obj.nextInt();
      }
      int flag=0;
      for(i=0;i<n;i++)
      {
          if(ele==a[i])
          {
              System.out.print("Element found at position "+(i+1));
              flag=1;
              break;
          }
      }
      if(flag==0)
      {
          System.out.print("Element not found");
      }
    }
}