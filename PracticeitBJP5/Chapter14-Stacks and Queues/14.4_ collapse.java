public void collapse(Stack<Integer> stack){
    int sum=0;
    Stack<Integer> hold = new Stack<Integer>();
    if (stack.size()%2 == 0){
        while(stack.empty() == false){
            int que = stack.pop() + stack.pop();
            hold.push(que);
        }
        while (hold.isEmpty() == false ){
            stack.push(hold.pop());
        }
    }else{
        hold.push(stack.pop());
        while(stack.empty() == false){
            int que = stack.pop() + stack.pop();
            hold.push(que);
        }
        while (hold.isEmpty() == false ){
            stack.push(hold.pop());
        }
    }
}