public void doubleList(ArrayList<String> list) {
    for (int i = 0; i<list.size(); i++){
        String temp;
        temp = list.get(i);
        list.add(i,temp);
        i++;
    }
}