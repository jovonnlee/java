public void stutter(ArrayList<String> list, int k){
    List<String> hold = new ArrayList<String>();
    Iterator<String> pass = list.iterator();
    if (k <=0){
        list.clear();
    }else{
        for(int i =0; i<list.size();i++){
            int index =0;
            for(int j=0;j<k;j++){
                hold.add(list.get(i));
            }
        }
    }list.clear();
    list.addAll(hold);
                
}