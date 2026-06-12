package arrays;

import java.util.Arrays;
public class TwoDArrayDemo {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // method 1 of printing
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);     
//   this will print just hashcode
            System.out.println(Arrays.toString(arr[i]));    
            //this can be used
        }

        //method 2 of printing
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);       
// //this will print just hashcode
//            System.out.println(Arrays.toString(arr[i]));   
//  //this can be used or
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        char[][] charArray = new char[3][2];
        charArray[0][0] = 'a';
        charArray[0][1] = 'b';
        charArray[1][0] = 'c';
        charArray[1][1] = 'd';
        charArray[2][0] = 'e';
        charArray[2][1] = 'f';

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(Arrays.toString(charArray[i]));
        }

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j]+" ");
            }
            System.out.println();
        }

        //jagged array: arrays of different length arrays
        char[][] jaggedArray = new char[3][];
        jaggedArray[0] = new char[2];
        jaggedArray[1] = new char[3];
        jaggedArray[2] = new char[2];
        jaggedArray[0][0] = 'a';
        jaggedArray[0][1] = 'b';
        jaggedArray[1][0] = 'c';
        jaggedArray[1][1] = 'd';
        jaggedArray[1][2] = 'd';
        jaggedArray[2][0] = 'e';
        jaggedArray[2][1] = 'f';

        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
        int[][] jag= new int[2][];
        jag[0]=new int [1];
        jag[1]=new int[2];
        jag[0][0]=12;
        jag[1][0]=34;
        jag[1][1]=23;
        System.out.println();
        for (int[] is : jag) {
         
        System.out.println(Arrays.toString(is));   
        }
    }

}

