package Hashing;

import java.util.Scanner;

/* asume u hve to count ow many times 1 appear in an array or any no FREQUENCY COUNT 
    brute force :
    int fun(int n,int arr[])
        cnt=0
        for i to n {if arr[i] == n {cnt ++}}
        return cnt tc: O(n) which is inefficient for large numbers checking
    HASIHNG WILL DO SAME THING IN MUCH FASTER WAY IT DOES PRESTORE ADN FETCHING 
    logic is create a hasharrray whihc precompute of how many elemenst and then just fetch it with hash of 1*/ 
public class h1 {
    
  
    public static void main(String[] args) {
        System.out.println("entern n");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
        }

        //precompute
         int hash[]=new int[100000000];//✅ Valid Java syntax
// Array is allocated on the heap ✅
// May cause OutOfMemoryError if memory is insufficient ⚠️
// Does not cause a segmentation fault like in C/C++ ⚠️   
  for (int i = 0; i < a.length; i++) {
            
            hash[a[i]]+=1;
        }
        
        //fetch
        System.out.println("enter total no ");
        int q=sc.nextInt();System.out.println("enter numbers");
        for (int i = 0; i < q; i++) {
            int w=sc.nextInt();
            System.out.println(hash[w]);
        }
   sc.close(); }
}
