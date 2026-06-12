package arrays;

import java.util.Arrays;
    //My learnings:

public class ArrayDemo {
    public static void main(String[] args) {

        //1. why arrays: If 1000 variables contain values of same datatype, we can store them in a single variable as group of elements
        int x = 1;
        int y = 2;
        int z = 3;
        int arr[] = {1, 2, 3};

        //2. How to create an array:
            //type[] variableName;
        int[] arr1 = new int[10];
//        System.out.println(arr1[2]);        //printing an element

        //3. Inserting elements in array:
//        arr1[0] = 0;
//        arr1[1] = 1;
//        arr1[2] = 2;
        //this was repetitive, so we use for loop
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        int[] arr2 = {1,2,3,4};

        //4. Traversing an array
        System.out.println(arr2);  //does not work
        System.out.println(arr2.toString());    //does not work
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //we can use forEach loop also for traversing, but
        //  it only works on group of elements like collection
        for(int i : arr2){
            System.out.println(i);
        }

        //5. search an element in an array
        int arr5[] = {1,4,2,55, 7, -2};
        for (int i : arr5) {
            if (i==55){
                System.out.println("Found");
            }
        }
        for(int i : arr1){
            if(i==2)
                System.out.println("found 2");
        }

        //6. Find max element:
        int[] arr6 = new int[5];
        arr6[0] = 2;
        arr6[1] = 12;
        arr6[2] = 4322;
        arr6[3] = -32;
        arr6[4] = 22;
        int res = Integer.MIN_VALUE;
        for(int i: arr6){
            if(i>res){
                res = i;
            }
        }
        System.out.println(res);

        //7. print array in reverse order
        int[] arr7 = {1, 3,43, 4, 345, 53,5,4};
        for (int i = arr7.length-1; i >=0 ; i--) {
            System.out.println(arr7[i]);
        }
        
        //8. sum of array:
        int[] arr8 = {-2, 4, 55, -4, 11, -55, 11, 2};
        int sum=0;
        for(int i :arr8){
                sum+=i;
        }System.out.println(sum);
}}

