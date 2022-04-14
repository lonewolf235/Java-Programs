import java.util.*;
public class bsfunction {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] a = new int[n];
    for (int i=0; i<n; i++) {
        a[i] = sc.nextInt();
    } 
    int[] b = new int[n];
    b=a.clone();
    Arrays.sort(b);
    System.out.println("enter number to be searched");
    int target= sc.nextInt();
    int x= binarySearch(b, target);
    if(x==-1)System.out.println("element not found");
    else
    System.out.println("Found at "+(x+1)+" position");
    
}  
static int binarySearch(int[] arr,int target)  {
    int low = 0;
    int high=arr.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target)
        return mid;
        else if(arr[mid]<target)
        low=mid+1;
        else high=mid-1;
    }
    return -1;
}
int linearSearch(int[] arr, int target){
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target)
        return i;
    }
    return -1;
}
}
