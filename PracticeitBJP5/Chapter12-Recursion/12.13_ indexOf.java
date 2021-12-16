public static int indexOf(String s1, String s2){
    if(!s1.contains(s2)){
        return -1;
    }
    else if(s1.contains(s2.substring(0))){
        return (s1.indexOf(s2.substring(0)));
    }
    else {
        return 0;
    }

}