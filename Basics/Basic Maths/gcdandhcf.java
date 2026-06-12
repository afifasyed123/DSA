/*GCD (Greatest Common Divisor) and HCF (Highest Common Factor) mean the same thing.

Definition:
The largest number that divides both numbers exactly.

Example:
Factors of 12 = 1, 2, 3, 4, 6, 12
Factors of 18 = 1, 2, 3, 6, 9, 18

HCF/GCD(12, 18) = 6

Brute Force Approach

Check all numbers from 1 to min(a, b). Remember this one line:

gcd(a, b) = gcd(b, a % b) until b == 0, then a is the answer.
Euclidean algo is gcd(a,b) = gcd (a-b,b) a> b untill one becomes 0 other is ans */
public class gcdandhcf {

    public static void main(String[] args) {
        //brute force 
         int n1=20,n2=40,ans=0;
        // for (int i = Math.min(n1,n2);i>=1;i--){
        //     if((n1%i==0)&&(n2%i==0)){
        //         System.out.println(i);break;
        //     }
        // }
        //euclidean takes a lot of time for a large no
        while(n1>0 && n2 >0){
            if (n1>n2) n1=n1%n2;
            if(n2>n1)n2=n2%n1;

        }if(n1==0) ans=n2;
        if(n2==0)ans=n1;

System.out.println(ans);
    }
}  // tc is log fi (min a,b) always remember whenever division is happ  tc is logarithmic 
//GCD = HCF
// Euclidean Algorithm is the optimal solution.
// Time Complexity: O(log(min(a,b)))
// Used in fraction simplification, LCM calculation, number theory, and DSA problems.