class Solution {
    public ListNode reverseList(ListNode head) {
       if(head ==null || head.next == null) 
       {
           return head;
       }
        ListNode curr = head , prev = null, right;
                ListNode newNode = new ListNode();
                while(curr != null){
                        right = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = right;
                }
                return prev;
    }
}