class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        int i=1,j=x;
        while(i<=j){
            int mid = i+(j-i)/2;
            if((long)mid*mid<x){
                i=mid+1;
            }else if((long)mid*mid>x){
                j=mid-1;
            }else{
                return mid;
            }   
        }
        return j;
    }
}
