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
        for(i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=-1;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}