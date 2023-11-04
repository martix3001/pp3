import java.util.Arrays;
public class MyArray {
    //a
    static int even(int[] array){
        int sum = 0;
        for(int i=0; i < array.length;i++){
           if (array[i]%2 ==0 ){
                sum++;
           }
        }
        return sum;
    }
    //b
    static int postiveOdd(int[] array){
         int sum = 0;
        for(int i=0; i < array.length;i++){
           if (array[i]%2 != 0 && array[i] > 0){
                sum++;
           }
        }
        return sum;
    }
    //c
    static int[] reverse(int[] array){
        int l = array.length;
        int[] reversed = new int[l];
        
        for(int i = 0; i < l; i++){
            reversed[i] = array[l - 1 - i];
        }
        return reversed;
    }
    //d
    static String compare(int[] array1, int[] array2){
        int l1 = array1.length;
        int l2 = array2.length;
        if(l1 != l2){
            return "false";
        }
        for (int i = 0 ; i < l1; i++){
            if(array1[i] != array2[i]){
                return "false";
            }
        }
        return "true";
    }
    //e
    static int[] different(int[] array1, int[] array2){
        int l1 = array1.length;
        int l2 = array2.length;

        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] differentElements = new int[Math.max(l1,l2)];
        int count = 0;
        int i = 0; 
        int j = 0;

        while (i < l1 && j < l2) {
            if (array1[i] < array2[j]) {
                differentElements[count] = array1[i];
                count++;
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        while (i < l1) {
            differentElements[count] = array1[i];
            count++;
            i++;
        }

        //Ususwanie zer
        differentElements = Arrays.copyOf(differentElements, count);

        return differentElements;
    }
    //f
    static String exist(int number, int[] array){
        for (int i : array){
            if (i == number){
                return "true";
            }
        }
        return "false";
    }  
    //g
    static int secondMax(int[] array){
        int firMax = array[0];
        int secMax = array[1];
        int l = array.length;
        for(int i = 0; i < l; i++){
            if(array[i] > firMax){
                secMax = firMax;
                firMax = array[i];
            }if (array[i] < firMax && array[i] >= secMax) {
                secMax = array[i];
            }
        }
        return secMax;
    }
    //h
    static int lastColumn(int[][] array){
        int sum = 0;
        int rows = array.length;
        for( int i : array[rows-1]){
            sum += i;
        }
        return sum;
    }
    //i
    static int[][] swap(int[][] array){
        int rows = array.length;
        int[][] swapped = array;
        int[] first = array[0];
        int[] last = array[rows-1];

        swapped[0] = last;
        swapped[rows-1] = first;

        return swapped;
    }
    static int[] two2one(int[][] array){
        int rows = array.length;
        int totlen = 0; //totallenght

        for (int r = 0; r < rows; r++) {
            totlen += array[r].length;
        }
        int[] connected = new int[totlen]; 
        int i = 0;
        for(int r = 0; r < rows;r++){
            for (int c = 0; c < array[r].length;c++){
                connected[i] = array[r][c];
                i++;
            }
        }
        return connected;
    }
    public static void main(String[] args) {
        int[] a = {-1,-2,3,4,5,6};
        int[] b = {-1,-2,8};
        int[] c = {123,456,12,6,125,125,236,1246,134,563};
        int[][] d = {{1,4,6,9,9},{1,4},{1,1,1,1},{2,8}};
        System.out.println(even(a));
        System.out.println(postiveOdd(a));
        System.out.println(Arrays.toString(reverse(a))); //MEGA WAŻNE JAK PRINTOWAĆ ARRAYE
        System.out.println(compare(a, c));
        System.out.println(Arrays.toString(different(a, b)));
        System.out.println(exist(12, a));
        System.out.println(secondMax(a));
        System.out.println(lastColumn(d));
        System.out.println(Arrays.deepToString(swap(d)));
        System.out.println(Arrays.toString(two2one(d)));





    }
}
