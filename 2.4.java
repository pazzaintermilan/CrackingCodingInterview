    public LinkedListNode solution1(LinkedListNode n, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while (n.next != null) {
            LinkedListNode next = n.next;
            n.next = null;
            if (n.data < x) {
                if (beforeStart == null) {
                    beforeStart = n;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = n;
                    beforeEnd = n;
                }
            } else {
                if (afterStart == null) {
                    afterStart = n;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = n;
                    afterEnd = n;
                }
            }
            n = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public LinkedListNode solution2(LinkedListNode n, int x) {
        LinkedListNode beforeStart=null;
        LinkedListNode afterStart=null;
        while(n.next!=null){
            LinkedListNode next=n.next;
            if(n.data<x){
                n.next=beforeStart;
                beforeStart=n;
            }else{
                n.next=afterStart;
                afterStart=n;
            }
            n=next;
        }
        if(beforeStart==null)
            return afterStart;
        LinkedListNode cur=beforeStart;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=afterStart;
        return beforeStart;
    }
