package org.spring;

import org.spring.BubbleSort.BubbleSort;
import org.spring.LinearAndBinarySearch.BinarySearch;
import org.spring.LinearAndBinarySearch.LinearSearch;

public class App 
{
    public static void main( String[] args )
    {

        int arr[] = {3,5,7,12,45,67,89,45};
        int target = 89;
        int target1 = 45;
        //linear search
        LinearSearch ln = new LinearSearch();
        int result = ln.linear(arr, target);
        if(result != -1){
            System.out.println("Element found on index "+ result);
        }
        //binary search
        BinarySearch bn = new BinarySearch();
        int result1 = bn.binary(arr, target1);
        if(result1 != -1){
            System.out.println("Element found on index "+ result1);
        }
        //bubble sort
        BubbleSort b = new BubbleSort();
        int[] arr1 = {8,32,4,9,13,1,7};
        b.bubbleSort(arr1);
    }
}
