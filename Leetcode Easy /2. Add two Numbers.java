class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res  = new ListNode();
        ListNode node = res;
        int carry = 0;
        while(l1 != null || l2 != null){
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a+b+carry;
            node.next = new ListNode(sum % 10);
            carry = sum/10;
            node = node.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        
        if(carry != 0){
            node.next = new ListNode(carry);
        }
        return res.next;
        
    }
}