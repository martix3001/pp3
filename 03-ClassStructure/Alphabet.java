public class Alphabet {
    static boolean isAlphabet(String t){
        
        t = t.toLowerCase();

        for(int i = 1; i < t.length();i++){
            char b = t.charAt(i-1);
            char c = t.charAt(i);
            if(b > c){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
