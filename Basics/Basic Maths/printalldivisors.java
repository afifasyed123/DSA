import java.util.*;

public class printalldivisors {
    public static void main(String[] args) {
        int n =36;
        List<Integer> list = new ArrayList<>();
        // for (int i = 1; i <= n ; i++) {
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // } // we can also do this in big oh of sqouare root of n 
    //u can use a list in java we cant reperesent tc in function like sqrt so real tc is O (no of factors * log(no of factors))
         for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                list.add(i);
                if (n/i !=i)
                    list.add(n/i); // add in list
            } 
    }
    Collections.sort(list);
    System.out.println(list);
}}/* Logic : go from 1 to n and chekc if its divided or not completely 
    time comlexity big oh of n */

