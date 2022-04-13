package com.company.sortowanie;

public class BubbleSort {
    public static void main(String[] args) {
        int [] bubble = {4,6,1,8,5,2,3,9,7};
        bubbleSort(bubble);
        for (int i : bubble) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
