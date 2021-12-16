public void stretch(int value){
    if(value <= 0){
        front = null;
    }       
    ListNode current = front;
    while(current != null){
        for(int i = 0;i<value-1;i++){
            int hold = current.data;
            current.next = new ListNode(hold, current.next);
            current = current.next;
        }
        current = current.next;
    }
    
}