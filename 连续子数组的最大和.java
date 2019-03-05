/*
DP的经典问题。

dp[i-1] <=0 　　dp[i] = a[i]
dp[i-1] > 0        dp[i] = a[i] + dp[i-1]
每次与当前最大值进行比较。maxsum = max(dp[i],maxsum);
🦊

*/

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if(len == 0){
            return 0;
        }
        int []dp = new int[len];
        int maxsum = array[0];
        dp[0] = array[0];
        for(int i = 1; i < len;i++){
            if(dp[i-1] <= 0 ){
                dp[i] = array[i];
            }
            else{
                dp[i] = dp[i-1] + array[i];
            }
            maxsum = Math.max(dp[i],maxsum);
        }

        return maxsum;        
    }
}
