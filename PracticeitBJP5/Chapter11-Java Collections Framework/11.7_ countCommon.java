public int countCommon(List<Integer> listA, List<Integer> listB){
    ArrayList<Integer> hold = new ArrayList<Integer>();
    ArrayList<Integer> hold2 = new ArrayList<Integer>();
    try {
        for (int i =0;i< listA.size();i++){
            for (int j=0; j< listB.size();j++){
                if(listA.get(i)==listB.get(j)){
                    if(hold.contains(listA.get(i)) == false){
                        hold.add(listA.get(i));
                    }
                }
            }
        }
    }catch (Exception e){
        System.out.println("");
    }
    return hold.size();
}