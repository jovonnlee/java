public void removeShorterStrings(ArrayList<String> list){
    List<String> empty = new ArrayList<String>();
    if(list.size() %2 ==0){
        for(int i = 0;i<list.size();i+=2){
            if(list.get(i).length()> list.get(i+1).length()){
                empty.add(list.get(i));
            }else{
                empty.add(list.get(i+1));
            }
        }
    }else {
        for(int i = 0;i<list.size()-1;i+=2){
            if(list.get(i).length()> list.get(i+1).length()){
                empty.add(list.get(i));
            }else{
                empty.add(list.get(i+1));
            }
        }empty.add(list.get(list.size()-1));
    }
        
    list.clear();
    list.addAll(empty);
            
}