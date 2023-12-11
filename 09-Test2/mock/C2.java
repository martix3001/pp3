public class C2 {
    
static boolean arr(int[] arr1,int[] arr2){
    int cou1 = 0;
    int cou2 = 0;
    
    for(int i= 0; i < arr1.length;i++){
        if(arr1[i] > 9 && arr1[i] < 100){
            cou1++;
        }   
    }
    for(int i= 0; i < arr2.length;i++){
        if(arr2[i] > 9 && arr2[i] < 100){
            cou2++;
        }   
    }
    if(cou1 == cou2){
        return true;    
    }
    return false;
}

}
