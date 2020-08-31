class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i=0,j=A.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(A[mid]>A[mid-1]&&A[mid]>A[mid+1]){
                return mid;
            }else if(A[mid+1]>A[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }
}
