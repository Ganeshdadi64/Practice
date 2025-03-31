package org.example.StringsAndArrays.Arraays;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6,5,7};
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(arr);
    }
}
