package org.example.StringsAndArrays.Arraays;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonElementsInTwoArrays {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8,3};
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                ans.add(arr2[j]);
            }
            hs.add(arr2[j]);
        }

        System.out.println(ans);

    }
}
