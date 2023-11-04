public class Clock {
    int hour; // 0 - 23
    int min;   // 0 - 59
    int alarmHour=-1;
    int alarmMin=-1;
    
    Clock(){
        this.hour = 0;
        this.min = 0;
    }
    public Clock(int h, int m) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            this.hour = h;
            this.min = m;
        } else {
            System.out.println("Takie godz nie istnieja, ustawiam 0:00");
            this.hour = 0;
            this.min = 0;
        }
    }
    
    void setClock(int h,int m){
        hour = h;
        min = m;
    }
    void setClock(){
        hour = 0;
        min = 0;
    }
    void displayClock(){
        System.out.printf("time: %02d:%02d\n", hour,min);
    }
    void addOneMinute(){
       if (min == 59 && hour < 23) { 
            min = 0;
            hour++;
       }else{
            if (min == 59 && hour == 23){
                min = 0;
                hour = 0;
            }else{
                if (hour <= 23 &&  min < 59){
                    min++;
                }
            }
        }
        if(hour == alarmHour && min == alarmMin){
            System.out.println("beep-beep-beep-beep !! ");
        }
    }
    void setAlaram(int h,int m){
        alarmHour = h;
        alarmMin = m;
    }
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 47);
        c1.displayClock();
        c1.setClock(18,14);
        c1.displayClock();
        c1.setClock(9,3);
        c1.displayClock();

        c1.setClock(23,58);
        c1.displayClock();
        
        c1.addOneMinute();
        c1.displayClock();

        c1.addOneMinute();
        c1.displayClock();

        c1.setClock(3,59);
        c1.displayClock();
        c1.addOneMinute();
        c1.displayClock();
        c1.setAlaram(4, 1);
        c1.addOneMinute();

    }
}
