public void switchPairs(){
    ListNode first = front;
    ListNode second = first.next;
    while (first != null && second != null){
        int one = first.data;
        int two = second.data;
        first.data = two;
        second.data = one;
        first = second.next;
        second=first.next;
        }
       
}