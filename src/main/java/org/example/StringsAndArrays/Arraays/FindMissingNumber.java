package org.example.StringsAndArrays.Arraays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,7,8};
        int Missisum=0;
        for(int i=0;i<arr.length;i++){
            Missisum +=arr[i];
        }
        //System.out.println(Missisum);
        int n=arr.length;
        int lastval=arr[n-1];
       // System.out.println(lastval);
       int originalsum=0;
       for(int j=0;j<=lastval;j++){
           originalsum+=j;
       }
        System.out.println(originalsum-Missisum);
    }
}
