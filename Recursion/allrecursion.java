package Recursion;

public class allrecursion {
    
    //print name n times using recursion 
    // tc: O(n) alwasy take the func call how many times its n time 
    // sc:O(n) sc is stack space in recursion so the 3 fun sits in stack ntil the base case
    //  is met so stacl space is also n times

    void fun (String s ,int n,int i ){
        if(i>=n)
            {          
                return;
            } 
        
        System.out.println(s);
        fun(s, n, i+1);
    }
    // print linearly 1 to n
    void fun1 (int n ,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        fun1(n, i+1);
    }
    
     // print linearly 1 to n using backtracking ( no + used) use - coz u ned to go back 
     // in backtrack print should always be after fuunc call u make sure tht first we backtrack then [rmt]
    void fun3 (int i ,int n){
        if(i<1){
            
            return;
        }
        fun3(i-1,n);   // always this should before print in backtrack
        System.out.println(i);
    }

    // print linearly n to 1
    void fun2 (int n ){
        if(n<1){
            return;
        }
        System.out.println(n);
        fun2(n-1);
    }

    //print n -1 backtrack
    void fun4(int n,int i ){
        if(i>n) return;
        fun4(n,i+1);
        System.out.println(i);
        
    }
    
    public static void main(String[] args) {
        allrecursion r =new allrecursion();
        // r.fun("afifa", 3,  0);
        r.fun4(4,1);
    }
}
