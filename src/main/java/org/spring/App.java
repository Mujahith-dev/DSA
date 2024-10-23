package org.spring;

import org.spring.BubbleSort.BubbleSort;
import org.spring.InsertionSort.InsertionSort;
import org.spring.LinearAndBinarySearch.BinarySearch;
import org.spring.LinearAndBinarySearch.LinearSearch;
import org.spring.SelectionSort.SelectionSort;

public class App 
{
    public static void main( String[] args )
    {

        int arr[] = {3,5,9,23,45,87,98};
        int target = 9;
        int target1 = 87;
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

        //selection sort
        SelectionSort s = new SelectionSort();
        int[] arr2 = {8,32,4,9,13,1,7};
        s.selectionSort(arr2);

        //insertion sort
        InsertionSort i = new InsertionSort();
        int[] arr3 = {8,32,4,9,13,1,7};
        i.insertionSort(arr3);
    }
}
