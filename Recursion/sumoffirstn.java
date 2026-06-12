package Recursion;
/* Recursion is  calling function itself until a specified condition is met 
    that condtion is called base condition u can hve a counter initialized and hve a stop condition */
class sumoffirstn {
    int summation(int n){
              
        if (n==0){
            return 0;
        }
        return n + summation(n+1);
    }
    int factorial(int n){
                
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        sumoffirstn s =new sumoffirstn();
    //    System.out.println(s.summation(3));
       System.out.println(s.factorial(5));
    }
}