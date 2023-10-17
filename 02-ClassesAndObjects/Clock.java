public class Clock {
    public static void main(String[] args) {
        int hours = 3;
        int minutes = 14;

        int totalMinutes = hours * 60 + minutes;
        int totalSeconds = totalMinutes * 60;

        System.out.printf("time: %02d:%02d\n", hours,minutes);
        // %02 daje że będzie dwucyfrowe, jak chemy więcej to może być %03 i wtedy da np 007

        System.out.printf("minutes from midnight: %d minutes%n", totalMinutes);
        System.out.printf("seconds from midnight: %d seconds%n", totalSeconds);
    }
}