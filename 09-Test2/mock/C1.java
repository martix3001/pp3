public class C1{
    int[] numers;

    public C1(int a, int b, int c, int d, int e) {
        this.numers = new int[]{a, b, c, d, e};
    }
    public boolean different(){
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 ; j++){
                if(numers[i] == numers[j] && i != j){
                    return false;
                }
            }
        }
        
        return true;
    }    
    
}