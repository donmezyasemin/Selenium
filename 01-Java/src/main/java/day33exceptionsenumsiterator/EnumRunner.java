package day33exceptionsenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {

        Cities ankara = Cities.ANKARA;
        System.out.println(ankara);//ANKARA

        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);//Adana

        System.out.println("Cities.ANKARA.getPlateCode() = " + Cities.ANKARA.getPlateCode());


    }
}
