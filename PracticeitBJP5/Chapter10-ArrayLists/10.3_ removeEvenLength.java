public void removeEvenLength(ArrayList<String> list){
    Iterator<String> hold = list.iterator();
    List<String> toRemove = new ArrayList<String>();
    int index =0;
    while (hold.hasNext()){
        String word = hold.next();
        if( word.length()%2!=1){
            toRemove.add(word);
        }
    }
    list.removeAll(toRemove);
}