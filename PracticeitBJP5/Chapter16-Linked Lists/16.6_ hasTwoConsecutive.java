public boolean hasTwoConsecutive(){
    if(front == null){
        return false;
    }
    ListNode first = front;
    ListNode second = first.next;
    while(second != null){
        if((first.data+1) == second.data){
            return true;
        }
        first = second;
        second = first.next;
    }
    return false;
}