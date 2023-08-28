package B171;

import java.util.HashMap;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Depo {
    static Scanner input = new Scanner(System.in);


    static HashMap<String, Urun> urunlerMap = new HashMap<>();           //map olusturdukk
    //key kismi string olarak id ler var
    //value kisminda ise Urun clasdaki variableler var

    //cons olusturduk ve hasmapi icine koyduk

    public Depo() {urunlerMap = new HashMap<>(); }




    //methodlara gecelimmm

    // ------------------------------------------------------------------------
    //urunguncelleme methodu olabilir
    //id yi otomatik atama yapilabilirr
    public static void girisPaneli() {

        String secimOpr = "";
        do {
            System.out.println("Q-04 :) GRUBU depomuza hosgeldiniz...");
            System.out.println("LUTFEN YAPMAK İSTEDİGİNİZ İSLEMİ SECİNİZ \n" +
                    "1 : URUN TANIMLAMA \n" +
                    "2 : URUN LİSTELEME \n" +
                    "3 : URUN GİRİSİ \n" +
                    "4 : RAFA KOYMA \n" +
                    "5 : URUN CIKISI \n" +
                    "6 : SİSTEMDEN CIKIS "
            );
            secimOpr = input.next();
            switch (secimOpr) {
                case "1":
                    urunTanimlama();
                    break;
                case "2":
                    urunListele();
                    break;
                case "3":
                    urunGirisi();
                    break;
                case "4":
                    rafaKoy();
                    break;
                case "5":
                    urunCikisi();
                    break;
                case "6":

                    if(secimOpr.equals("6")){
                        System.out.println("emin misiniz? emin iseniz e tusuna basiniz");
                      String  secim=input.next();
                        if(secim.equals("e")){
                            System.out.println("tekrar görüşmek üzere");
                        }else {
                            girisPaneli();
                        }
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("hatali giris yaptiniz.Tekrar deneyiniz...");
                    System.out.println();
            }
        } while (!secimOpr.equals("6"));
    }

    public static void urunTanimlama() {

        System.out.println("lütfen id giriniz");
        String id1 = input.next();

        if (urunlerMap.containsKey(id1)) {
            try {
                throw new IdKullanimda();
            } catch (IdKullanimda e) {
                System.err.println("!!!!! id zaten kullanimda");
            }


        } else {
            System.out.println("lütfen ürün ismi giriniz");
            String isim1 = input.next();

            System.out.println("lütfen üretici ismi giriniz");
            String uretici1 = input.next();

            System.out.println("lütfen birim giriniz");
            String birim1 = input.next();

            Urun yeniurun = new Urun(id1, isim1, uretici1, birim1, 0, "-");
            //cons u kullanarak yeniurun olusturduk
            urunlerMap.put(id1, yeniurun);   //ve map e ekledik
        }
        urunListele();
    }

    public static void urunListele() {
        System.out.println("------------------depomuzda bulunan ürünlerimizin listesi---------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "id", "isim", "uretici", "miktar", "birim", "raf");
        System.out.println("----------------------------------------------------------------------------------");
        for (Urun w : urunlerMap.values()) {      //value kısmını dolasacak
            //System.out.println(urunlerMap);    //{1=id:1    isim:a     uretici:a   miktar:0      birim:a     raf:-}
            System.out.println(w);
        }
    }

    private static void urunGirisi() {
        try {
            System.out.println("Lütfen id giriniz:");
            String id = input.next();
            System.out.println("Lütfen girmek istediğiniz ürün miktarını giriniz:");
            int girisMiktari = input.nextInt();

            if (urunlerMap.containsKey(id)) {
                Urun urun = urunlerMap.get(id);
                urun.setMiktar(urun.getMiktar() + girisMiktari);
                System.out.println("Ürün girişi başarılı.");
            } else {
                System.err.println("Girilen id'ye ait ürün bilgisi bulunamadı.");
                System.out.println("Depomuzda bulunan id numaraları aşağıda gösterilmektedir. Lütfen geçerli bir id numarasıyla işlem yapınız:");
                System.out.println(urunlerMap.keySet());
            }
        } catch (InputMismatchException e) {   //miktari harf girerse uyari alsin
            System.err.println("hatali giris yaptiniz.Lutfen sayi giriniz...");
        }
        urunListele();
    }

    private static void rafaKoy() {
        System.out.println("lütfen id giriniz");
        String id = input.next();
        System.out.println("ürünü koymak istediginiz rafi seciniz");
        String raf = input.next();

        if (urunlerMap.containsKey(id)) {
            Urun urun = urunlerMap.get(id);
            urun.setRaf(raf);
            System.out.println("ürününüz " + raf + " numarali rafa koyulmustur...");

        } else {
            System.out.println("gecerli bir id numarasi girmediniz");
            System.out.println("depomuzda bulunan id numaralari asagida gibidir.Lütfen gecerli id numarasi ile islem yapiniz " +
                    ":\n" + urunlerMap.keySet());
        }
        urunListele();
    }


    private static void urunCikisi() {
        try {
            System.out.println("Lütfen çıkış yapmak istenen ürünün id'sini giriniz:");
            String id = input.next();
            System.out.println("Lütfen çıkış yapmak istenen miktarı giriniz:");
            int cikisMiktari = input.nextInt();

            if (urunlerMap.containsKey(id)) {
                Urun urun = urunlerMap.get(id);
                int yeniMiktar = urun.getMiktar() - cikisMiktari;
                if (cikisMiktari <= urun.getMiktar()) {
                    urun.setMiktar(yeniMiktar);
                    System.out.println(id + " nolu üründen " + cikisMiktari + " miktarı kadar çıkış yapıldı.");
                } else {
                    System.err.println("Çıkış yapılacak miktar mevcut miktarından az olmalıdır.");
                }
            } else {
                System.err.println("Girilen id ile eşleşen bir ürün bulunamadı.");
                System.err.println("Depomuzda bulunan id numaraları aşağıda gösterilmektedir. Lütfen geçerli bir id numarasıyla işlem yapınız:");

            }System.out.println(urunlerMap.keySet());
        } catch (InputMismatchException e) {
            System.err.println("hatali giris yaptiniz.lütfen sayi giriniz....");
        }
    }










}

