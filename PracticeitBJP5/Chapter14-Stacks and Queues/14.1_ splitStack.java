public void splitStack(Stack<Integer> stack){
    Queue<Integer> bbq = new LinkedList<Integer>();
    int num =0;
    while (stack.empty() == false){
        bbq.add(stack.pop());
    }
    for(int i =0;i<bbq.size();i++){
        num = bbq.remove();
        if (num < 0){
            stack.push(num);
        }else {
            bbq.add(num);
        }
    }
    while(!bbq.isEmpty()){
        stack.push(bbq.remove());
    }
        
}