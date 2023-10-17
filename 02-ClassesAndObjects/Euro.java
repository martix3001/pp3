public class Euro {
    /*s formats strings.
    d formats decimal integers.
    f formats floating-point numbers.
    t formats date/time values. 
    %.presioion*/
    public static void main(String[] args) {
        double buyingRate = 4.0957;
        double sellingRate = 4.1065;
        double spread = sellingRate-buyingRate;

        System.out.printf("Bank buys EUR: %.4f\nBank sells EUR: %.4f\nSpread: %.4f", buyingRate,sellingRate,spread);
    }
}
