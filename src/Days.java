public class Days {
    public static void main(String[] args) {
        int days = 5000;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;

        System.out.println("Общее кол-во дней:"+ days);
        System.out.println("Общее кол-во лет:"+ years);
        System.out.println("Общее кол-во месяцев:"+ month);
        System.out.println("дней:"+ leftDays);

    }
}
