package Recursion;
public class palstring {
    
    //  boolean checkpal(String s , int  n, int i ){
    //     if(i>=n/2) return true;
    //     if(s.charAt(i)!=s.charAt(n-i-1)) return false;
    //     checkpal(s, n, i+1);
    //     return true;
    //  }
     
    public boolean isPalindrome(String s) {
        
         int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))
                != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    
    
}
    public static void main(String[] args) {
        String s= "Madam";
        palstring r=new palstring();
        System.out.println(s);
        r.isPalindrome("a man nama ");
    }
}
