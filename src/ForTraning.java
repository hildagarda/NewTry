import java.util.Scanner;

public class ForTraning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        String[] a = str.split(" ");

        char operation1 = a[1].charAt(0);
        char operation2 = a[3].charAt(0);
        int one = Integer.valueOf(a[0]);
        int two = Integer.valueOf(a[2]);
        int three = Integer.valueOf(a[4]);

        if (operation1 == '+' & operation2 == '-') {
            System.out.println((one + two) - three);
        } else if (operation1 == '-' & operation2 == '-') {
            System.out.println((one - two) - three);
        } else if (operation1 == '*' & operation2 == '-') {
            System.out.println((one * two) - three);
        } else if (operation1 == '/' & operation2 == '-') {
            System.out.println((one / two) - three);
        }

    }

}











