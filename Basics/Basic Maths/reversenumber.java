public class reversenumber {
    public static void main(String[] args) {
        int n =-7789;
        int lastdigit,rev=0;
        while(n!=0){// v. imp do != bcoz it will handle negative nums
            lastdigit = n % 10;
            n=n/10;
            rev= rev*10 + lastdigit;
        }System.out.println(rev);
    }// time complexity log10 n becoz div is 10 s   
}
/* Logic: 
 why r we adding 10 so if we want reverse we know tht we r getting 9 by mod then 8 so on
    if we add 90 plus 8 we can get 98 ths ehy we r adding 0 again and again multplying 10  */