public List<Integer> alternate(List<Integer> listA, List<Integer> listB) {
    List<Integer> alternate = new ArrayList<>();
    int i = 0;
    int count =0;
    try {
        for (i=0;i<listA.size();i++) {
        alternate.add(count, listA.get(i));
        count++;
        alternate.add(count, listB.get(i));
        count++;
        }
    }catch (Exception e){
        System.out.print("");
    }
    int extra =alternate.size();
    int start =listA.size();
    
    if (listA.size() != listB.size())
        for (int j = start;j<(listB.size());j++){
            alternate.add(extra,listB.get(j));
            extra++;              
        }
    return alternate;
}