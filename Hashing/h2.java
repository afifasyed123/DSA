package Hashing;

import java.util.Scanner;

//String hashing lowercase letters
public class h2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        //precompute
        int hash[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i)]++; // cahr is f so f-a which is ascii minus 67 is small a so we get the position
        }
        //for caps letter
        //hash[s.charAt(i)-'A']++ and for all letters siimply s.charAt(i)++
        System.out.println("enter q");
        int q=sc.nextInt();char a;
        for (int i = 0; i < q; i++) {
            a=sc.next().charAt(0);
            System.out.println(hash[a-'a']);
        }
        sc.close(); 
    }
}
