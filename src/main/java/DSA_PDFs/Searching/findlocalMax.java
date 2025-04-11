package DSA_PDFs.Searching;

public class findlocalMax {
    public static void main(String[] args) {
        int[] arr = {9, 7, 3, 8, 5, 6, 2};
        int localMax = findLocalMaximum(arr);
    }
//an element is said to be local  it should be greater then it neigoers
    private static int findLocalMaximum(int[] arr) {
        int n=arr.length;
        int l=0;
        int h=arr.length;
        if(n==0) return 0;
        int ans=-1;
        if(arr[0]>arr[1]) return  arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        while (l<h){
            int m=l+h/2;
            if(arr[m] >arr[m-1] && arr[m]>arr[m+1]){
                ans=arr[m];
            }
            else if(arr[m] < arr[m-1] ){
               h=m-1;  //move left
            }else{
                l= m+1; // move right
            }
        }
        return ans;

    }
}
