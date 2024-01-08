public class C6_Number implements Ok {
    private int[] arr;
    
    public C6_Number(int[] arr) {
        this.arr = arr;
    }
    @Override
    public boolean ok(){
        int l = arr.length;
        for(int i=0; i < l;i++){
            int x = arr[i];
            if(i%2 == 0 ){
                if( x%2 !=0 ){
                    return false;
                }
            }else{
                if( x%2 == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    
}
