public static boolean isReverse(String s1, String s2){
    String text = s1.toLowerCase();
    String opp = s2.toLowerCase();
    if (text.length() == 0 && opp.length() == 0){
        return true;
    }
    else if (text.length() == opp.length()){
        int length = opp.length();
        char textChar = text.charAt(0);
        char oppChar = opp.charAt(length-1);
        if (textChar == oppChar){
            return isReverse(text.substring(1), opp.substring(0,length -1));
        }else{
            return false;
        }
    }
    return false;
}