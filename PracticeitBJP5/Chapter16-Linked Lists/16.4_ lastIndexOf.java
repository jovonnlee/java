public int lastIndexOf(int num){
    int index = -1;
    int i = 0;
    ListNode list = front;
    while(list!= null){
        if(list.data == num){
            index = i;
        }
        i++;
        list = list.next;
    }
    return index;
}