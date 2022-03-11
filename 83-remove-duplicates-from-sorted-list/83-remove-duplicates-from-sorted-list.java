/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode actualNode = head;
        
        while(actualNode != null && actualNode.next != null){
            if (actualNode.val == actualNode.next.val){
                actualNode.next = actualNode.next.next;
            }
            else{
                actualNode = actualNode.next;
            }
        }
        return head;
    }
}