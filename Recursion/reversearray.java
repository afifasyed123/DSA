package Recursion;
/* reversing logic:  using two pointers
    there is l  in first ad r at end , swap , then incr l and decr r again swap ,
    kab tak jab tak l crosses r
    pseducode:
            f(l,r ) if l>=r return 
            swap(l,r);f(l+1,r-1);  
    can we do tis using twp vaar yes we can
    i and n-i-1 which is corespondinf last element swap (i, n-i-1) until bothr equal or i<=n/2  */

import java.util.Arrays;

public class reversearray {
    void swap(int arr[],int a ,int b){
            int temp=arr[a];arr[a]=arr[b];arr[b]=temp;

    }
    
    void reverse(int arr[],int n ,int i){
        if(i>=n/2) 
            return ;
        swap(arr,i,n-i-1);
        reverse(arr, n, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2};
        reversearray r=new reversearray();
        System.out.println(Arrays.toString(arr));
        r.reverse(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
}
