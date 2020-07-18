import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ele=obj.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int low=0, high=n-1, flag=0, index=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(ele<a[mid])
            {
                high=mid-1;
            }
            else if(ele>a[mid])
            {
                low=mid+1;
            }
            else if(ele==a[mid])
            {
                index=mid;
                flag=1;
                break;
            }
            else{}
        }
        if(flag==0)
        {
            System.out.print("Element not found");
        }
        else
        {
            System.out.print("Element present at position "+(index+1));
        }
    }
}