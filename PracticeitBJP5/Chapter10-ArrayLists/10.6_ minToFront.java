public void minToFront(ArrayList<Integer> list){
    int hold = list.get(0);
    int location = 0;
     for (int i = 0; i<list.size();i++){
        if (list.get(i) < list.get(location)){
            location = i;
     }
   }list.add(0, list.get(location));
    list.remove(location+1);   
}