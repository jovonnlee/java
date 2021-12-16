public int deleteBack(){
    if (front == null){
        throw new NoSuchElementException();
    }
    ListNode list = front;
    int end=1;
    if(front.next == null){
        end = front.data;
        front = null;
        return end;
    }
    while(list.next.next != null){
        list= list.next;
    }
    end=list.next.data;
    list.next = null;
    return end;

}