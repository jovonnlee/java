public void filterRange(ArrayList<Integer>list, int min, int max){
    List<Integer> remove = new ArrayList<Integer>();
    for (int i : list){
        if(i >=min && max>=i){
            remove.add(i);
        }
    }list.removeAll(remove);
}