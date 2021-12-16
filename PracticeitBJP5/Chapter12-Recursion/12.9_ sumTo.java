public static double sumTo(int n){
    double hold;
    if (n<0){
        throw new IllegalArgumentException();
    }
    if (n == 0){
        return 0;
    }
    if (n == 1){
        return 1/n;
    }
    if (n >= 2 ){
        hold = 1.0/n + sumTo(n-1);
        return hold;
    }
    return n;
}