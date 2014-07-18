    /****
     * Buffered space allowed Solution
     * O(N) runtime
     * *****/
    public void solution1(LinkedListNode n) {
        Hashtable table = new Hashtable();
        LinkedListNode previous = null;
        while (n != null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }
    
    /***
     * O(1) space, O(N2) time
     * No buffer space allowed solutions
     * ***/
    public void solution2(LinkedListNode head){
        if(head==null)
            return;
        LinkedListNode current=head;
        while(current!=null){
            LinkedListNode runner=current;
            while(runner.next!=null){
                if(runner.next.data==current.data)
                    runner.next=runner.next.next;
                else
                    runner=runner.next;
            }
            current=current.next;
        }
    }
