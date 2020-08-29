class Solution {
    public int arrangeCoins(int n) {
        /*return (int)(Math.sqrt(1+8*(long)n)-1)/2;*/
        /*int i=1;
        while(n>=i){
            n-=i;
            i++;
        }
        return i-1;*/
        if(n==0||n==1) return n;
        int i=1,j=n/2;
        while(i<=j){
            int mid = i+(j-i)/2;
            if((long)mid*(mid+1)/2<n){
                i=mid+1;
            }else if((long)mid*(mid+1)/2>n){
                j=mid-1;
            }else{
                return mid;
            }
        }
        return j;

    }
}
