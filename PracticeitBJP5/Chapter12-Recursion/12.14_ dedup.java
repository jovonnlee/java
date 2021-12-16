public static String dedup(String s){
    String hold = "";
    int i=0,j=1,n=0;
    if(s.length() == 0){
        return hold;
    }
    else if(s.length() == 1){
        hold = hold + s;
        return hold;
    }
    else {
        if(s.charAt(i) != s.charAt(j)){
            hold = hold + s.charAt(i);
            return hold + dedup(s.substring((n+1),s.length()));
        }
        else if(s.charAt(i) == s.charAt(j)) {
            hold = hold;
            return hold + dedup(s.substring((n+1),s.length()));
        }
    }
    return "";
}