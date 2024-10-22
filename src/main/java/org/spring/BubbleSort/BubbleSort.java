package org.spring.BubbleSort;

public class BubbleSort {

    public void bubbleSort(int[] arr){

        int size = arr.length;
        int temp = 0;
        System.out.println("Before sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
                System.out.println();
                for(int n:arr){
                    System.out.print(n+" ");
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
