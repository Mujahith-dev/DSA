package org.spring.SelectionSort;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        int size = arr.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("SelectionSort");
        System.out.println("Before sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }

        for(int i=0;i<size-1;i++){                                  //5,2,4,9,7,3
            minIndex = i;
            for (int j = i+1;j<size;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println();
            for(int n:arr){
                System.out.print(n +" ");
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for (int n :arr){
            System.out.print(n +" ");
        }
    }
}
