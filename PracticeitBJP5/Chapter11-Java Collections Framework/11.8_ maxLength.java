public int maxLength(Set<String> input){
    int length =0;
    for(String i : input){
        if(i.length()>=length){
            length = i.length();
        }
    }
    return length;
}