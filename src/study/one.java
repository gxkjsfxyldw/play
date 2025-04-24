package study;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
      
        //冒泡排序
        int[] arr = {4, 6, 5, 7, 3, 2, 8, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));

        System.out.println("ldw");
    }
}

