public static int multiplyEvens(int n){
    int hold;
    if(n<1){
        throw new IllegalArgumentException();
    }
    if (n==1){
        return n*2;
    }
    if (n>1){
        hold = (n*2)*multiplyEvens(n-1);
        return hold;
    }
    return n;
                         
}