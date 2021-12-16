public void removeInRange(List<Integer> list, int value, int start, int end) {
    int i =0;
    for (i = start; i<end;i++){
        if (list.get(i) == value){
            list.remove(i);
            end--;
            i--;
        }
    }
    
    
}