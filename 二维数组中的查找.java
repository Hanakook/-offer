/*
我们把目标值定为target，以副对角线划分，可以看出来小的在左边，大的在右边。
也就是我们从右上角开始，如果target < a[i][j],那么j--,如果target > a[i][j],那么i++.这样出来的复杂度就o(m+n)了。
🐰
*/

public class Solution {
    public boolean Find(int target, int [][] array) {
        int col = array[0].length-1;
        int row = 0;
        while(col>=0 && row < array.length){
            if(array[row][col] == target){
                return true;
            }
            else if(array[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
