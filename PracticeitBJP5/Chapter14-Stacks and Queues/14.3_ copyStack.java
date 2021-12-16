public static Stack<Integer> copyStack(Stack<Integer> pancake){
    Queue<Integer> bbq = new LinkedList<>();
    Stack<Integer> pancake2 = new Stack<>();
    while(pancake.empty() == false){
        bbq.offer(pancake.pop());
    }
    while (bbq.isEmpty() == false){
        pancake2.push(bbq.poll());
    }
    while(pancake2.empty() == false){
        bbq.offer(pancake2.pop());
    }
    while (bbq.isEmpty() == false){
        pancake.push(bbq.peek());
        pancake2.push(bbq.poll());
    }

    return pancake2;
}