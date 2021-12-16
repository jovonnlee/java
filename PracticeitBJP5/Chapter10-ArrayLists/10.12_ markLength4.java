public void markLength4(ArrayList<String> list ){
    int index =0;
    for (int i =0;i<list.size();){
        String hold = list.get(i);
        if (hold.length()== 4){
            list.add(i, "****");
            i++;
        }i++;
    }
}