public int countDuplicates(){
    if (front == null){
        return 0;
    }
    int duplicates = 0;
    ListNode first = front;
    ListNode second =first.next;
    while(second != null){
        if(first.data == second.data){
            duplicates++;
        }
        first = second;
        second = first.next;
    }
    return duplicates;
}