public class C3 {
    static boolean isAlphabet(String t){
        t.toLowerCase();

        for(int i= 0; i < t.length()-1 ; i++){
            char b = t.charAt(i);
            char c = t.charAt(i+1);
            if(b > c ){
                return false;
            }
        }
        return true;
    }

   static String hideText(String t){
        String f = t.substring(0, 1);
        String l = t.substring(t.length()-1);

        String ast = "*".repeat(t.length()-2);

        String copy = f+ast+l;
        return copy;
    }
}
