public void removeInRange(ArrayList<Integer> list,int a, int b, int c){
    int index=0;
    for (int i = b; i<c;i++){
        if (a==list.get(i)){
            index = i;
            list.remove(index);
            c--;
            i--;
        }
    }
}