import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      int i,j,p;
      int length=scanner.nextInt();
      int rotations=scanner.nextInt();
      int a[]=new int[length];
      for(i=0;i<length;i++)
      {
          a[i]=scanner.nextInt();
      }
      for(i=0;i<rotations;i++)
      {
          int m=a[0];
          for(j=length-1;j>=0;j--)
          {
              p=a[j];
              a[j]=m;
              m=p;
          }
      }
      for(i=0;i<length;i++)
      {
          System.out.print(a[i]+" ");
      }
    }
}
