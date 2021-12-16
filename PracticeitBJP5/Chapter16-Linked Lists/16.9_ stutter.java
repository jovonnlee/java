public void stutter(){
    ListNode current = front;
    while(current != null){
        int hold = current.data;
        current.next = new ListNode(hold, current.next);
        current = current.next.next;
    }
}