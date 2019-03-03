/*
很容易想到的是o(n)的算法。但是不能忽略它旋转数组的性质。数组划分成两段，且都是有序的。可以优化到o(logn)

设中间的数为mid，最左边的数为left,最右边的数为right,很容易得到三种情况，设最小的数为numer.

array[mid] < array[right]　　  此时numer在[left,mid]，right = mid
array[mid] > array[right]        此时number在[mid+1,right]，left = mid+1
array[mid] = array[right]　　 此时不能确定是否在有序范围内，所以只能顺序查找，让right-1

因为二分的范围会到只剩下两个的情况，而我们只是在用mid和right做比较。所以在第一种情况不能直接right=mid-1.🦊

*/

O(n)
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0){
            return 0;
        }
        else{         
            int num = array[0];
            for(int i = 0 ;i < len;i++){
                if(num > array[i]){
                    num = array[i];
                }
            }       
            return num;
        }
    }
}


OR

O(logn)
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0){
            return 0;
        }
        else{
            int left = 0;
            int right = len-1;
            int mid,num;
            
            while(left < right){
                mid = (left + right)/2;
                if( array[mid] < array[right]){
                    right = mid;
                }
                else if(array[mid] > array[right]){
                    left = mid+1;
                }
                else{
                    right--;
                }
            }
            num = array[left];
            
            return num;
        }
    }
}
