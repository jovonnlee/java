public boolean contains3(List<String> list){
    Map<String, Integer> map = new HashMap<String, Integer>();
    Iterator<String> it = list.iterator();
    
    while (it.hasNext()) {
        String word = it.next();
        if (map.containsKey(word)) {
            map.put(word, map.get(word) + 1);
        } else {
            map.put(word, 1);
        }
    }
    
    return map.containsValue(3);
}