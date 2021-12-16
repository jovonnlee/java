public boolean hasOdd(Set<Integer>list){
    boolean a = false;
    for( int i : list){
        if (i%2 == 1){
            a = true;
        }
    }
    return a;
}