/* prime def:
   exactly 2 factors: 1 and itself  first is the brute force 
   for i to n then n%i==0 
   cnt ++ check cnt == 2 so prime then no prime tc big oh of n
   below is optimal with a tc of sqrt n*/
public class prime {
    public static void main(String[] args) {
        int n =13,cnt=0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i==0){
                cnt++;
                if(n/i!=i) // v. v. imp 
                    cnt++;
            }
        }if (cnt ==2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
