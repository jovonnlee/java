public static boolean isSorted(double[] input){
    
       
        if (input == null || input.length <= 1) {
            return true;
        }
 
        for (int i = 0; i < input.length - 1; i++){
        
            if (input[i] > input[i + 1]) {
                return false;
            }
        }
 
        return true;
    }