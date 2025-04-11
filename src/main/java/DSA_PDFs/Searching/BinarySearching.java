package DSA_PDFs.Searching;

import java.util.Arrays;

public class BinarySearching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9, 6};
        Arrays.sort(arr);
        int s = 0;
        int taarget=4;
        int e = arr.length;

        while(s<e){
            int m=s+e/2;
            if(arr[m]==taarget){
                System.out.println(m);
                break;
            }else if(arr[m]<taarget){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }

    }
}
