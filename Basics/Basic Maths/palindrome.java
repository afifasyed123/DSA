public class palindrome {
       
    public static boolean isPalindrome(int x) {
        int lastdigit,rev=0;
        int original=x;
        while(x> 0 ){
            lastdigit=x%10;
            x=x/10;
            rev=rev*10 + lastdigit;
        }
        if (original == rev)
            return true;
        else 
            return false;
    }
     public static void main(String[] args) {
        
    System.out.println(isPalindrome(242));
}
}
