public static String repeat(String s, int n){
    String hold ="";
    if (n < 0){
        throw new IllegalArgumentException();
    }
    else if (n == 0){
        return hold; 
    }
    else if (n == 1){
        return s;
    }
    else {
        return s+repeat(s,n-1);
    }
}