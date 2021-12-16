public boolean isUnique(Map<String, String> map){
    boolean a = true;
    Set<String> compare = new HashSet<String>();
    Iterator<String> check = map.values().iterator();
    int index =0;
    while (check.hasNext()){
        compare.add(check.next());
        index++;
    }
    if(compare.size() != index){
        a = false;
    }
    return a;
}