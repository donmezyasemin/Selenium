package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);//2464

        int multiplication = getMultiplicationFromThreeToNine();
        System.out.println(multiplication);//181440

        System.out.println(getMultiplicationFromThreeToNine2());//181440

        System.out.println(getFactorial(5));

        System.out.println(getSumOfEvensBetweenTwoInt(13, 7));

    }

    //9 ) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }

    //10 ) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2.yol
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //11) Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){

        if(x==0){
            return 1;

        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;

        }else {
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }

    }
    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }

       return IntStream.
               range(a+1,b).
               filter(t->t%2==0).
               sum();
    }
    //2.yol
    public static int getSumOfEvensBetweenTwoInt2(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }

        return IntStream.
                range(a+1,b).
                filter(Utils::isNumberEven).
                sum();
    }









}
