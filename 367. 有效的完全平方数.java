class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1,j=num;
        if(num==1) return true;
        while(i<=j){
            int mid = i+(j-i)/2;
            if((long)mid*mid<num){
                i=mid+1;
            }else if((long)mid*mid>num){
                j=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
