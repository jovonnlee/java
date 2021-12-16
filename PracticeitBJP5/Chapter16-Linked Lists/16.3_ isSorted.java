public boolean isSorted(){
    if(front == null){
        return true;
    }
    ListNode list = front;
    ListNode list2 = list.next;
    while(list2 != null){
        if (list.data > list2.data){
            return false;
        }
        list = list2;
        list2 = list.next;
    }
    return true;
}