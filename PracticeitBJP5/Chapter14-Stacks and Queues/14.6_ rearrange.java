public void rearrange(Queue<Integer> bbq){
    Queue<Integer> odd = new LinkedList<Integer>();
    Queue<Integer> even = new LinkedList<Integer>();
    while(!bbq.isEmpty()){
        if (bbq.peek()%2 == 0){
        even.offer(bbq.remove());
        }else{
        odd.offer(bbq.remove());
        }
    }
    while(!even.isEmpty()){
        bbq.offer(even.remove());
    }
    while(!odd.isEmpty()){
        bbq.offer(odd.remove());
    }
    
}