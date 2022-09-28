class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode new_head= new ListNode(0);
        new_head.next= head;
        ListNode slow = new_head;
        ListNode fast = new_head;
        for(int i=1;i<=n+1;i++)
        {
            fast= fast.next;
        }
        while(fast != null)
        {
            slow= slow.next;
            fast= fast.next;
        }
        slow.next = slow.next.next;
        return new_head.next;
    }
}