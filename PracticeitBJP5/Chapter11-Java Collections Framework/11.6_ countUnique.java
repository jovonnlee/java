public int countUnique(List<Integer> list){
    int unique =0;
    List<Integer> empty = new ArrayList<>();
    for (int i =0; i<list.size();i++){
        if (list.contains(list.get(i))==true){
            if (empty.contains(list.get(i))== false){
                empty.add(list.get(i));
            }
        }
        
    }unique = empty.size();
    
            
    return unique; 
}