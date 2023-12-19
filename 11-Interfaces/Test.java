public class Test {
    public static void main(String[] args) {
  /*       Tv tv1 = new Tv();
        tv1.on();
        tv1.display();
        tv1.channelUp();
        tv1.setChannel(7);
        tv1.volumeDown();
        tv1.display();
        tv1.setChannel(142);
        tv1.display();
        tv1.channelDown();
        tv1.display();
        tv1.off();
        tv1.display();
*/
        Tv t = new Tv();
        t.on();
        t.display();
        t.setChannel(15);
        for(int i=0;i<6;i++){
            t.volumeUp();
        }
        t.display();
        t.off();
        t.display();
    }   
}
