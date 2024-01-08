public class C2_Isogram {
    
    static public boolean isogram(String text){
        int l = text.length();

        for(int i=0; i<l ;i++){
            for(int j=0;j<l;j++){
                char a = text.charAt(i);
                char b = text.charAt(j);
                if(i!=j && a == b){
                    return false;
                }
            }
        }
        return true;
    }
}
