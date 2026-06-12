package Basics.patterns;
import java.util.*;
public class pyramin2 {
    // 1
    // 12
    // 123
    
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){

        System.out.println("Enter rows");
        int n =sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
             
                for(j=1;j<=i;j++){
               
                System.out.print(j);
            }
            System.out.println();
        }

        }
    }
}


