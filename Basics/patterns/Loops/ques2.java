package Basics.patterns.Loops;
/*
 Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
*/

import java.util.Scanner;
public class ques2 {
public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {
       int  n;
    do{

        System.out.println("enter student marks:");
        int mark=sc.nextInt();
        if (mark>=90) {
            System.out.println("This is Good");
        } else if (mark>=89 && mark >= 60) {
            System.out.println("This is also Good");
        }else {
            System.out.println("this is good as well");
        }   
        System.out.println("Do u want to continue Enter 0 or 1");
         n =sc.nextInt();     
    }while(n==1);
    
        System.out.println("thank you for using");
    }
        }
}
