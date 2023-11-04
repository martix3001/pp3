public class RangeStatistics {
   // a.	Number of items within the specified range <x,y>
   static int numberOfItems(int x,int y){
    int sum = 0;
    for(int i = x;i <= y; i++){
        sum++;
    }
    return sum;
   }
   // b.	Sum of numbers in the given range  <x,y>
   static int sumOfItems(int x,int y){
    int sum = 0;
    for(int i = x;i <= y; i++){
        sum = sum + i;
    }
    return sum;
   }
   // c.	Arithmetic mean of the numbers in the given range  <x,y>
   static double meanOfItems(int x, int y){
    double sum = sumOfItems(x, y);
    double num = numberOfItems(x, y);
    double mean = sum/num;
    return mean;
   }




    public static void main(String[] args) {
        System.out.println(numberOfItems(5, 10));
        System.out.println(sumOfItems(5, 10));
        System.out.println(meanOfItems(5, 10));
    }

}
