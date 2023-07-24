package B171;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim =111111111;

        do {
            try {


                System.out.println("\n\t === Q05 DEPO YÖNETİMİ ===\t\n" +
                        "1- Ürün Tanımlama\n" +
                        "2- Ürün Listele\n" +
                        "3- Ürün Girişi\n" +
                        "4- Ürünü Rafa Koy\n" +
                        "5- Ürün Çıkışı\n" +
                        "0-Çıkış");
                System.out.println("Yapmak istediğiniz işlemi seçiniz :");
                secim = scanner.nextInt();


                switch (secim) {
                    case 1:
                        DepoUygulamasi.urunTanimlama();
                        break;
                    case 2:
                        DepoUygulamasi.urunListele();
                        break;
                    case 3:
                        DepoUygulamasi.urunGirisi();
                        break;
                    case 4:
                        DepoUygulamasi.urunuRafaKoy();
                        break;
                    case 5:
                        DepoUygulamasi.urunCikisi();
                        break;
                    case 0:
                        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz...");
                        break;
                    default:
                        System.out.println("Geçerli bir deger giriniz!");

                }

            }catch (InputMismatchException e){
                System.out.println("Geçerli bir deger giriniz!");
                scanner.nextLine();
            }
        }while (secim != 0) ;

    }
    }

