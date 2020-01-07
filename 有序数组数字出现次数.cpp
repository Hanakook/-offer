/*
  最容易想到的是暴力枚举。O(n)
  因为是有序数组，所以可以二分查找最先出现的k和最后出现的k,位置相减即可。🐰
*/
class Solution {
public:
    int GetNumberOfK(vector<int> data ,int k) {
        /*
        int len = data.size();
        int cnt = 0;
        for(int i = 0; i < len ;i++){
            if(data[i] == k){
                cnt++;
            }
        }
        return cnt;  */
        int first = BinSearch1(data,k);
        int last = BinSearch2(data,k);
        if(first == -1 || last == -1)    return 0;
        else    return (last - first + 1);
    }
private:
    int BinSearch1(vector<int> data, int k){
        int low = 0; int high = data.size()-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(data[mid] < k)    low = mid + 1;
            else if(data[mid] > k)    high = mid - 1;
            else {
                if((data[mid-1] == k) && (mid-1 >= 0)){
                    high = mid-1;
                }
                else    return mid; 
           }
        }
        return -1;
    }
    int BinSearch2(vector<int> data, int k){
        int low = 0; int high = data.size() - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(data[mid] < k)    low = mid + 1;
            else if(data[mid] > k)    high = mid - 1;
            else{ 
                if((data[mid+1] == k) && (mid+1 < data.size())){
                    low = mid + 1;
                }
                else    return mid;
            }
        }
        return -1;
    }
};
