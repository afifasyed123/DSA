package Basics.patterns.Loops;

import java.util.Scanner;
public class loops_hw {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)){
             System.out.println("enter n :");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        
        }
       
    }
    
}}

