public static int digitMatch(int first, int second){
    int match=0;
    
    if(first < 0 || second < 0){
        throw new IllegalArgumentException();
    }
    else if ( first == 0 && second == 0){
        return 1;
    }
    else {
        if (first % 10 == second % 10){
            match++;
        }
        if (first/10 == 0 || second/10 ==0){
            return match;
        }
        return match + digitMatch(first/10, second/10);
    }
}