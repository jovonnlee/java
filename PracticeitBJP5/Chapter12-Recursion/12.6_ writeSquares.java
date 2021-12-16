public static void writeSquares(int n){
    if (n < 0){
        throw new IllegalArgumentException();
    }
    if (n == 1){
        System.out.print(1);
        return;
    }
    if (n==2 ){
        System.out.print((n-1)*(n-1)+ ", ");
        writeSquares(n-2);
        System.out.print(n*n);
    }
    if (n>3 && n%2 == 0){
        System.out.print((n-1)*(n-1) + ", ");
        writeSquares(n-2);
        System.out.print(", " + (n)*(n));
    }
    if (n>=3 && n%2 == 1){
        System.out.print((n)*(n) + ", ");
        writeSquares(n-2);
        System.out.print(", " + (n-1)*(n-1));
    }
    
}