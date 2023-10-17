public class Counter {
    int value = 0;
 
    void increase(){
        value++;
    }
    void decrease() {
        value--;
    }
    void increase10() {
        value += 10;
    }
    void decrease10() {
        value -= 10;
    }
    void reset() {
        value = 0;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increase10();
        c1.increase10();
        c1.increase();
        c1.increase();
        c1.increase();
        System.out.println(c1.value);
        c2.decrease10();
        c2.decrease10();
        c2.decrease10();
        c2.decrease10();
        c2.decrease();
        c2.decrease();
        c2.decrease();
        c2.decrease();
        c2.decrease();
        c2.decrease();
        c2.decrease();
        System.out.println(c2.value);

    }
}
