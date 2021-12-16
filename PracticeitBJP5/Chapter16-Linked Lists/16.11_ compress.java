public void compress(int comp){
    ListNode current = front;
    ListNode hold = current.next;
    while (hold != null){
        for(int i=0;i<=comp-1;i++){
            int num = (current.next.data + current.data);
            current.next.data = num;
            hold = current;
            current = null;
        }
        current = hold.next;
    }
}