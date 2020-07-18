import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j,temp;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}