package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Hashmap in java prob so it stores a key and corresponding val
the key is the number of array and it has frequency count map<key,val>
before we need to store one greater than the total elements like 13 but here map store only the items required
and their val
 
No, a normal Map is not sorted.

Common Map types:

Map Type	Sorted?	Order
HashMap	❌ No	Random/unpredictable
LinkedHashMap	❌ Not sorted	Insertion order
TreeMap	✅ Yes	Sorted by key
*/
public class h3 {
   public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = cin.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values of array : ");
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<n;i++){
            arr[i] = cin.nextInt();
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);// map.getOrDefault(key, defaultValue) v.imp method

        }

        System.out.print("Enter value of query : ");
        int query = cin.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        for (int i = 0; i < query; i++) {
            
            int number=cin.nextInt();
            //fetch method
            System.out.println(map.getOrDefault(number, 0));
        }
    }
}
/* For DSA, remember these three methods:

map.entrySet()
map.keySet()
map.values()

and especially:

for (Map.Entry<Integer, Integer> entry : map.entrySet())

because you'll use it often in frequency-count problems. */