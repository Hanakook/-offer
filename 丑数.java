/*
因为这个number只包含2,3,5的因子，所以根据以2，3，5来做判断和维护。令number数组里的第一个元素为1。因为我们要让丑数数列有序，
所以要每次使这三个因子组成的最小的数进入数组。

ugly:1

array 2: 2
array 3: 3
array 5: 5
比较（2，3，5）->min_n = 2,2进入ugly[]


ugly:1 2 
array 2: 4
array 3: 3 6
array 5: 5 10

然后比较当前的值(4，3，5)，3再进入ugly[]

怎么保证每次都是比较最前面的数呢。我们用做标记的方式实现。

i2,i3,i5来表示当前的位置。如果当前的number能除尽它们，指针就向后移。
*/


public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0){
            return 0;
        }
        int []ugly = new int[index];
        int i2=0;
        int i3=0;
        int i5=0;
        int cnt = 0;
        ugly[0] = 1;
        int num = 0;
        while(cnt < index-1){
            num = Math.min(ugly[i2]*2,Math.min(ugly[i3]*3,ugly[i5]*5));
            if(num == ugly[i2] * 2)    i2++;
            if(num == ugly[i3] * 3)    i3++;
            if(num == ugly[i5] * 5)    i5++;
            ugly[++cnt] = num;
            
        }
        return ugly[index-1];
    }
}
