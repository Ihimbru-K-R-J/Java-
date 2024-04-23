import java.util.Arrays;

public class ReverseArray {

    //a method called reverseArray takes an array of integers
    /* int[] arr, scans through it beginning from the last element
    to the first (in reverse order) and stores every element in a new
    array called revArr then prints it out
    * */

    public static int[] revAr(int array[]){


        int length = array.length;
        int[] reverseArray = new int[length];

       for(int i = length-1,  j = 0; i>=0; i--, j++){

           array[i] = reverseArray[j];

       }



        return reverseArray;
    }




















    public static int[] reverseArray(int[] arr){

        int length = arr.length;
        int[] revArr = new int[length];

        for(int i = length-1, j = 0; i >= 0; i--, j++  ){

            revArr[j] = arr[i];
        }
        return revArr;

    }

    public static int[] revArr(int[] arra){
        int n = arra.length;
        int[] revArr = new int[n];
        for(int j = n-1, k = 0; j >= 0; j--, k++){
            revArr[k] = arra[j];
        }
        return revArr;
    }




    public static void main(String[] args){
//        int[] testArr = {2,4,6,8,10};
//        int[] reversedArray = revArr(testArr);
//        System.out.println(Arrays.toString(reversedArray));
//
//
//
//        int[] myArray = {1,2,3,4,5,6,7};
//        int[] revArray = reverseArray(myArray);
//        System.out.println(Arrays.toString(revArray));
//


        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        int[] test = revAr(arr);
        System.out.println(Arrays.toString(test));

    }

}
