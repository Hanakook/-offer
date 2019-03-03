/*
熟悉一下链表的数据结构。Collections的reverse好用。
递归做法这个思想很重要。🦊
*/




/**给出的数据结构。
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
**/
import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList array = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        while(listNode != null){
            array.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(array);
        return array;
        
    }
}


OR


import java.util.ArrayList;

public class Solution {
    ArrayList array = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return array;
        }
        printListFromTailToHead(listNode.next);
        array.add(listNode.val);
        return array;
        
    }
}

