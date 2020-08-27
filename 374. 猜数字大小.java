public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=1,j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            int flag = guess(mid);
            if(flag==-1){
                j=mid-1;
            }else if(flag==1){
                i=mid+1;
            }else{
                return mid;
            }
        }
        return i;
    }
}
