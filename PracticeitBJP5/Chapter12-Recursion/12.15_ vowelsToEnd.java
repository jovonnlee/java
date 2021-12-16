public static String vowelsToEnd(String s){
    int n= s.length();
    int i=0;
    String hold ="";
    String vowels = "aeiou";
    if(s.length() == 1){
        return hold +s;
    }
    else if (s.length() >1){
        if (vowels.contains(s.charAt(i))){
            hold = s.charAt(i)+hold;
        }
       i++;
       return hold + vowelsToEnd(s.substring(i,n));
    }
    return vowels;
}