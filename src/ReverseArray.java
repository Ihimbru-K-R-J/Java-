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

          reverseArray[j] = array[i];

       }



        return reverseArray;
    }




    public static void main(String[] args){


        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        int[] test = revAr(arr);
        System.out.println(Arrays.toString(test));

    }

}
