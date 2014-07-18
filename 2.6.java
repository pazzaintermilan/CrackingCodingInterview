    public LinkedListNode solution(LinkedListNode head){
        LinkedListNode fast=head;
        LinkedListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                break;
        }
        if(fast==null||fast.next==null)
            return null;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
