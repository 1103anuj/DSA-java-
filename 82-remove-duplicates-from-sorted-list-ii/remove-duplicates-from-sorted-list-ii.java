class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while(head != null){
            
            // check duplicate
            if(head.next != null && head.val == head.next.val){
                
                // skip all duplicates
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                
                prev.next = head.next;  // remove duplicates
            }
            else{
                prev = prev.next;
            }
            
            head = head.next;
        }
        
        return dummy.next;
    }
}