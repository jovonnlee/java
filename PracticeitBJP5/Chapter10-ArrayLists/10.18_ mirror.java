public void mirror(ArrayList<String> list){
    List<String> hold = new ArrayList<String>();
    for(int i = list.size()-1;i>=0;i--){
        hold.add(list.get(i));
    }
    list.addAll(hold);
}