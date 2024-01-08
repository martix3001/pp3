public class C3_Logic {
    private boolean[] arr;

    public C3_Logic(boolean arr[]) {
        this.arr = arr;
    }
    
    public int opposite(){
        int count = 0;
        int l = arr.length;

        if(l<3){
            return 0;
        }
        for(int i = 1 ; i < l-1 ; i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                count += 1;
            }
        }
        return count;
    }
}
