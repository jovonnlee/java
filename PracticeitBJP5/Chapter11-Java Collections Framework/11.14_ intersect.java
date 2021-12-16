public Map<String, Integer> intersect(Map<String, Integer> mapA, Map<String, Integer> mapB){
    Map<String, Integer> mapC = new HashMap<String, Integer>();
    Iterator<Map.Entry<String, Integer>> itA = mapA.entrySet().iterator();
    while(itA.hasNext()){
        Map.Entry<String, Integer> A = itA.next();
        if(mapB.get(A.getKey())==A.getValue()){
            mapC.put(A.getKey(), A.getValue());
        }
    }
    return mapC;
}