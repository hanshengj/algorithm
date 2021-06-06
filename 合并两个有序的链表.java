输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;//辅助头节点
        while (l1!=null && l2!=null){
            //两链表不为空，一直找小的
            if(l1.val < l2.val ){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        //当有一个链表为空时，将里另一个的链表直接拼接在末尾即可
        if(l1 == null){
            head.next = l2;
        }else{
            head.next = l1;
        }
        return cur.next;

    }
}