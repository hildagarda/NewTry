public class Weight {
    public static void main(String[] args) {
        int gram = 1550000;

        int gramInKg = 1000;
        int gramInCentner = gramInKg * 100;
        int gramInTon = gramInCentner * 10;

        int ton = gram / gramInTon;
        int centner = (gram%gramInTon) / gramInCentner;
        int kg = ((gram % gramInTon) % gramInCentner) / gramInKg;
        int leftgram = gram - ton * gramInTon - centner *  gramInCentner - kg * gramInKg;


        System.out.println(ton);
        System.out.println(centner);
        System.out.println(kg);
        System.out.println(leftgram);
    }
}
