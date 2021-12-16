public int min(){
    if (front == null){
        throw new NoSuchElementException();
    }
    int low = front.data;
    ListNode list = front.next;
    while(list != null){
        if (list.data < low){
            low = list.data;
        }
        list = list.next;
    }
    return low;
}