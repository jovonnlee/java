public void set(int index, int element){
    ListNode current = front;
    for(int i = 0; i< index; i++){
        current = current.next;
    }
    current.data = element;
}