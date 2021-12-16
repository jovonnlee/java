public void stutter(Stack<Integer> stack){
    List<Integer>list = new ArrayList<Integer>();
    int i=0;
    while(stack.empty() == false){
        list.add(stack.pop());
    }
    int hold =0;
    for(int j=list.size()-1;j>=0;j--){
        hold = list.get(j);
        stack.push(hold);
        stack.push(hold);
    }
}