public void swapPairs(ArrayList<String> list){
    for (int i=0; i< (list.size()-1); i+=2){
        String a,b;
        a= list.get(i);
        b= list.get(i+1);
        list.set(i,b);
        list.set(i+1,a);
    }
}