public void interleave(ArrayList<Integer> listA, ArrayList<Integer> listB){
    List<Integer> hold = new ArrayList<Integer>();
    Iterator<Integer> ita = listA.iterator();
    Iterator<Integer> itb= listB.iterator();
    if(listA.size() > listB.size()){
        for(int i =0;i<listB.size();i++){
            hold.add(listA.get(i));
            hold.add(listB.get(i));
        }
        for(int j =listB.size();j<listA.size();j++){
            hold.add(listA.get(j));
        }
    }else if(listA.size() < listB.size()){
        for(int i =0;i<listA.size();i++){
            hold.add(listA.get(i));
            hold.add(listB.get(i));
        }
        for(int j =listA.size();j<listB.size();j++){
            hold.add(listB.get(j));
        }
    }else if(listA.size() == listB.size()){
        for(int i =0;i<listA.size();i++){
            hold.add(listA.get(i));
            hold.add(listB.get(i));
        }
    }
    listA.clear();
    listA.addAll(hold);
}