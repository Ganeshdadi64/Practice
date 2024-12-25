package org.example.TwoPointers;

public class FindMaxWaterArea {

//    public static void main(String[] args) {
//        int[] watweheigths={2,4,3,5,6,8,7,9};
//        int result=findMaxwaterArea(watweheigths);
//        System.out.println(result);
//
//    }
//
//    private static int findMaxwaterArea(int[] watweheigths) {
//        int p1=0;
//        int p2=watweheigths.length-1;
//        int maxarea=0;
//        while(p1<p2){
//            if(p1<p2){
//                int w=p2-p1;
//                int val=watweheigths[p1]*(w);
//                maxarea=Math.max(val,maxarea);
//                p1++;
//
//            }
//            else{
//                int w=p1-p2;
//                int val=watweheigths[p2]*(w);
//                maxarea=Math.max(val,maxarea);
//                p2--;
//            }
//        }
//        return  maxarea;
//
//    }
//
//

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = findMaxWaterArea(heights);
        System.out.println("Maximum water area: " + maxArea);
    }

    private static int findMaxWaterArea(int[] heights) {
        int p1 = 0; // Left pointer
        int p2 = heights.length - 1; // Right pointer
        int maxArea = 0;

        while (p1 < p2) {
            // Calculate the height and width of the container
            int height = Math.min(heights[p1], heights[p2]);
            int width = p2 - p1;

            // Calculate the area and update maxArea
            int area = height * width;
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter height inward
            if (heights[p1] < heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        return maxArea;
    }

}
