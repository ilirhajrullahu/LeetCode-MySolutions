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
    public int getDecimalValue(ListNode head) {
        List<Integer> nodeValues = new ArrayList(); 
        ListNode actualNode  = head;
        
        while(actualNode.next != null){
            nodeValues.add(actualNode.val);
            actualNode= actualNode.next;
        }
        nodeValues.add(actualNode.val);
        
        int a = 0;
        int diff = 1;
        for (int i = 0; i < nodeValues.size(); ++i){
         int power = nodeValues.size() - diff;
         a += nodeValues.get(i)*(Math.pow(2,power));
         diff= diff + 1;
        }
        return a;
    }
}