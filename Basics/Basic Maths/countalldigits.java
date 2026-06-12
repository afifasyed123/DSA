public class countalldigits {
    public static void main(String[] args) {
            int n=7789;
            // int  cnt=0;
            // while(n>0){
            //     cnt++;
            //     n=n/10;
                
            // }System.out.println(cnt);
           
            System.out.println( count(n));
    }
    static int count(int n ){
            int cnt = (int)Math.log10(n)+1;
            return cnt;
    }
}//  time complextiy is logbase10n bexoz of div 10 
/*  logic : Extract last digit -> % 10
Remove last digit  -> / 10
Build answer       -> ans * 10 + digit*/