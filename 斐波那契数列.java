/*
这里用的递推以及黄金分割公式。。🦊
*/


public class Solution {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int f0 = 0;
            int f1 = 1;
            int fn = f1+f0;
            for(int i = 2 ; i <=n ;i++){
                fn = f1+f0;
                f0 = f1;
                f1 = fn;
            }
            return fn;
        }
    }
}



OR



public class Solution {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            double k = Math.sqrt(5.0);
            double a = (1 + k) / 2;
            double b = (1 - k) / 2;

            int ans = (int)(1.0 / k * (Math.pow(a, n)- Math.pow(b, n)));
            return ans;
        }
    }
}
