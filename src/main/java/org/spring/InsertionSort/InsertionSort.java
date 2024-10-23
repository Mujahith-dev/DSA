package org.spring.InsertionSort;

public class InsertionSort {
    public void insertionSort(int[] arr){

        int size = arr.length;

        System.out.println();
        System.out.println("Insertion sort");
        System.out.println("Before sorting");
        for( int n:arr){
            System.out.print(n+" ");
        }
        for(int i=1;i<size;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&& arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
            System.out.println();
            for(int n:arr){
                System.out.print(n +" ");
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
