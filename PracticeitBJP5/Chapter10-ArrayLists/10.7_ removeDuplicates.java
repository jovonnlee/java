public void removeDuplicates(ArrayList<String> list){
    Set<String> rid = new HashSet<String>();
    rid.addAll(list);
    list.clear();
    list.addAll(rid);
    Collections.sort(list);
}