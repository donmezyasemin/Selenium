package B171;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepoUygulamasi {
    static List<Urun> urunListesi = new ArrayList<>();
    public static void urunTanimlama() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Tanımlama");
        System.out.print("Ürün İsmi: ");
        String urunIsmi = scanner.nextLine();
        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();
        System.out.print("Birim: ");
        String birim = scanner.nextLine();

        int id = urunListesi.size() + 1000;
        int miktar = 0;
        String raf = "    -    ";

        Urun urun = new Urun(id, urunIsmi, uretici, miktar, birim, raf);
        urunListesi.add(urun);

        System.out.println("Ürün başarıyla tanımlandı.");
        System.out.println();

    }

    public   static void urunListele() {
        System.out.println("Ürünleri Listeleme");

        if (urunListesi.isEmpty()) {
            System.out.println("Depoda hiç ürün bulunmamaktadır.");
        } else {
            System.out.println("------------ÜRÜN LİSTEMİZ-----------------");
            System.out.printf("%-10s   %-10s %-10s %-10s %-10s %5s","id","isim","uretici","miktar","birim","raf");
            System.out.println();
            System.out.printf("%-10s   %-10s %-10s %-10s %-10s %5s", "----", "------", "------", "------", "------", "  ------");
            System.out.println();

            for (Urun urun : urunListesi){
                System.out.printf("%-10s   %-10s %-10s %-10s %-10s %5s",
                        urun.getId(),urun.getUrunIsmi(),urun.getUretici(),urun.getMiktar(),urun.getBirim(),urun.getRaf());
                System.out.println();

            }
        }

        System.out.println();
    }

    public   static void urunGirisi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Girişi");
        System.out.print("Giriş yapmak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Giriş miktarını giriniz: ");
            int girisMiktari = scanner.nextInt();

            int yeniMiktar = urun.getMiktar() + girisMiktari;
            urun.setMiktar(yeniMiktar);
            urunListele();

            System.out.println("Ürün başarıyla depoya giriş yaptı.");
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    public static void urunuRafaKoy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürünü Rafa Koyma");
        System.out.print("Rafa koymak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Raf numarasını giriniz: ");
            String raf = scanner.next();

            urun.setRaf(raf);
            urunListele();

            System.out.println("Ürün başarıyla rafa koyuldu.");
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    public static void urunCikisi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Çıkışı");
        System.out.print("Çıkış yapmak istediğiniz ürünün ID numarasını giriniz: ");
        int urunId = scanner.nextInt();

        Urun urun = urunBul(urunId);
        if (urun != null) {
            System.out.print("Çıkış miktarını giriniz: ");
            int cikisMiktari = scanner.nextInt();

            int yeniMiktar = urun.getMiktar() - cikisMiktari;
            if (yeniMiktar < 0) {
                System.out.println("Stokta yeterli miktarda ürün bulunmamaktadır.");
            } else {
                urun.setMiktar(yeniMiktar);
                System.out.println("Ürün başarıyla depodan çıkış yaptı.");
                urunListele();
            }
        } else {
            System.out.println("Belirtilen ID numarasına sahip bir ürün bulunamadı.");
        }

        System.out.println();
    }

    public static Urun urunBul(int urunId) {
        for (Urun urun : urunListesi) {
            if (urun.getId() == urunId) {
                return urun;
            }
        }
        return null;
    }
}