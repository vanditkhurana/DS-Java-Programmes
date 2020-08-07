public class FindDuplicatesInAnArray 
{ 
    void printRepeating(int arr[], int n) 
    { 
        int i;   
        for(i=0;i<n;i++) 
        { 
            if(arr[Math.abs(arr[i])]>=0)
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
            {
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }          
    }  
    public static void main(String[] args)  
    { 
        FindDuplicatesInAnArray duplicate = new FindDuplicatesInAnArray(); 
        int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
        int size = arr.length; 
  
        duplicate.printRepeating(arr, size); 
    } 
}