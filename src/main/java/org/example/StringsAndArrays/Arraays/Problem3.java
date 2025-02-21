package org.example.StringsAndArrays.Arraays;

public class Problem3 {
//Find minimum time to return all the points?
//    Problem Statement
//    You are given an array points where points[i] = [xᵢ, yᵢ] represents a point on a 2D plane.
//
//    You can move either horizontally, vertically, or diagonally in one second.
//    Return the minimum time in seconds to visit all points in the order given.

    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0], y1 = points[i - 1][1];
            int x2 = points[i][0], y2 = points[i][1];

            // Time to move between two points is max of absolute x-difference and y-difference
            totalTime += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
        }

        return totalTime;
    }


}
