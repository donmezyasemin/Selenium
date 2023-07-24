package B171;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pojo.Metodlar.*;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(cicek + cicek + cicek + "   HOŞGELDİNİZ!    " + cicek + cicek + cicek + reset);
        urunTanimlama();
        System.out.println();
        urunListeleme();

        do {
            System.out.println("================================================================\n"
                             + " ⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽          ⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽ \n"
                             + "| " + cyanrengi + " ÜRÜN TANIMLAMAK İÇİN" + kirmizi + " 1 " + reset + " |" + "        | " + cyanrengi + "   ÜRÜN ÇIKIŞI İÇİN" + kirmizi + " 4 " + reset + "   |" + "\n"
                             + "|⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺|        |⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺|\n"
                             + "| " + cyanrengi + "ÜRÜN MİKTAR GİRİŞİ İÇİN" + kirmizi + " 2" + reset + "|" +"        | " + cyanrengi + "   ÜRÜN SİLMEK İÇİN" + kirmizi + " 5    " + reset + "|" + "\n"
                             + "|⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽|        |⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽|\n"
                             + "| " + cyanrengi + " ÜRÜN RAFA KOYMAK İÇİN" + kirmizi + " 3 " + reset + "|" + "        | " + cyanrengi + "ÇIKMAK İÇİN"+ cyanrengi + kirmizi + " 6" + cyanrengi + " YA BASINIZ" + reset + " | " + "\n"
                             + " ⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺          ⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺ " + reset);
            System.out.print("Seçiminiz: ");

            try {
                int secim = input.nextInt();
                input.nextLine();

                switch (secim) {
                    case 1:
                        urunTanimlama();
                        System.out.println();
                        urunListeleme();
                        break;
                    case 2:
                        urunGirisi();
                        System.out.println();
                        urunListeleme();
                        break;
                    case 3:
                        urunRafaKoy();
                        System.out.println();
                        urunListeleme();
                        break;
                    case 4:
                        urunCikis();
                        System.out.println();
                        urunListeleme();
                        break;
                    case 5:
                        urunSilme();
                        System.out.println();
                        urunListeleme();
                        break;
                    case 6:
                        System.out.println("Depo uygulamasından çıkılıyor...");
                        urunListeleme();
                        break;
                    default:
                        System.err.println("Geçersiz bir seçim yaptınız!");
                        break;
                }

                if (secim == 6) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.err.println("Hatalı giriş, lütfen sayısal bir giriş yapınız.");
                System.out.println();
                input.nextLine();
            }


        } while (true);

    }
}

