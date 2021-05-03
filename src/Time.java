public class Time {
    public static void main(String[] args) {
        int sec = 10000;

        int secondsInMin = 60;
        int secInHour = secondsInMin * 60;
        int secInDays = secInHour * 24 ;

        int days = sec / secInDays;
        int hour = (sec%secInDays) / secInHour;
        int min = ((sec%secInDays)%secInHour) / secondsInMin;
        int leftSec = sec - days * secInDays - hour * secInHour - min * secondsInMin;

        System.out.println("дано кол-во секунд:" + sec);
        System.out.println("это равно");
        System.out.println("дней:"+ days);
        System.out.println("часов:"+hour);
        System.out.println("минут:"+min);
        System.out.println("секунд:"+leftSec);








    }
}
