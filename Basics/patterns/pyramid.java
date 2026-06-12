package Basics.patterns;
import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){

        System.out.println("Enter rows");
        int n =sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
             for(int k = n-i;k>=1;k--){
                System.out.print(" ");
             }
                for(j=1;j<=i;j++){
               
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
}
