package Recursion;
/* Multiple recursion : cslling funtion more than one likt two trice times 
    very popur fir n queens , fibonacci is an easy eg 0 1 1 2 3 5 ...
    Logic is fn = f n-1 + f n -2 base case  is n<=1 return n */

    // Time complesxity is 2 raised to n as every recusrion func is callting two recu funct again 
    //exponenetial in nature 
    public class fibonacci {

    int fib(int n ){
        int last,slast;
        if (n<=1 ) return n;
        last=fib(n-1);
        slast=fib(n-2);
        return last +slast;
    }
    public static void main(String[] args) {
        fibonacci m= new fibonacci();
        System.out.println(m.fib(4));
    }
}