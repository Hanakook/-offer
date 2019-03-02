/*
使用java中的replace函数。。but，网上看到个更绝的,用replaceAll.这题有个坑，输入的是StringBuffer.要转成字符串再做替换。
🐰
*/

public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = "%20";
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == ' '){
                str.replace(i,i+1,s);
            }
        }
        return str.toString();

    }
}

OR 

public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = "%20";
        String str1 = str.toString().replaceAll(" ",s);
        return str1;
    }
}
