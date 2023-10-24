public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    static String months[] = {"Jan","Feb","Mar","Ap","May","Jun","July","Sie","wrz","paz","lis","gru"};

    public static void main(String[] args){
        System.out.println("Data w formacie yyyy-mm-dd to "+myDate());
        System.out.println(days());
        System.out.println(monthName());

    }
    //a WAZNE ZADANIE !!!!!
    static String myDate(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    //b
    static int days(){
        int sum=0;
        for (int i = 0; i < month; i++) {
            sum = sum + days[i];
        }
        return sum+day;
    }
    //c
    static String monthName(){

        return months[month-1];
    }
}
