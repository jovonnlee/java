public void removeEvenLength(Set<String> list){
    List<String> toRemove = new ArrayList<String>();
    for (String i : list){
        if (i.length()%2 == 0){
            toRemove.add(i);
        }
    }
    list.removeAll(toRemove);
}