package B171;

import java.util.*;

public class Metodlar {
    public static final String reset = "\u001B[0m";
    public static final String cyanrengi = "\033[1;96m";
    public static final String kirmizi = "\033[1;91m";
    public static final String mavi = "\033[1;94m";
    public static final String cicek = "\u001B[38;2;255;0;0m\u2740";

    static Scanner input = new Scanner(System.in);
    public static int urunId = 1000;
    static HashMap<Integer, Urun> urunTanimlamaListesi = new HashMap<>();
    static HashSet<Integer> urunIDListesi = new HashSet<>();

    public static void urunTanimlama() {

        System.out.println(  "Lütfen ürün ismini giriniz:" );
        String urunAdi = input.nextLine();

        System.out.println(   "Üretici adını giriniz:" );
        String ureticiAdi = input.nextLine();

        System.out.println(  "Ürün birimini giriniz: (Kg/Çuval/Kutu...)" );
        String birim = input.nextLine();

        Urun u1 = new Urun(urunId, urunAdi, ureticiAdi, birim, 0, "-");
        urunTanimlamaListesi.put(u1.getUrunId(), u1);

        urunId++;

        for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {

            urunIDListesi.add(w.getKey());
        }

    }

    public static void urunListeleme() {

        System.out.printf( mavi + "%-10s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Ürün Adı", "Üretici", "Birim", "Miktar", "Raf" + reset );
        System.out.println("------------------------------------------------------------------------------");

        for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
            System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n",
                    w.getValue().getUrunId(),
                    w.getValue().getUrunIsmi(),
                    w.getValue().getUretici(),
                    w.getValue().getBirim(),
                    w.getValue().getMiktar(),
                    w.getValue().getRaf());
        }
        System.out.println();
    }

    public static void urunGirisi() {

        if ((urunTanimlamaListesi.size() > 0)) {
            System.out.println("Lütfen ürün girişi yapmak istediğiniz ürün ID'sini yazınız.");

            try {
                int girisId = input.nextInt();
                input.nextLine();

                if (urunIDListesi.contains(girisId)) {
                    System.out.println("Girmek istediğiniz miktarı yazınız.");

                    try {
                        int girilenMiktar = input.nextInt();
                        input.nextLine();

                        if (girilenMiktar > 0) {

                            for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
                                if (girisId == w.getKey()) {
                                    w.getValue().setMiktar((w.getValue().getMiktar() + girilenMiktar));
                                }
                            }
                        } else {
                            System.err.println(" 0 veya negatif sayı girilemez");
                            urunGirisi();
                        }
                    } catch (InputMismatchException e) {
                        System.err.println( "Hatalı giriş! Lütfen sayısal bir miktar girişi yapınız." );
                        input.nextLine();
                    }
                } else {
                    System.err.println( "Girdiğiniz ID numarasına ait bir ürün bulunmamaktadır!");
                    urunGirisi();
                }
            } catch (InputMismatchException e) {
                System.err.println( "Hatalı giriş! Lütfen sayısal bir ürün ID numarası yazınız." );
                input.nextLine();
            }
        } else {
            System.err.println( "Ürün listesi boş, ürün ekleyin." );
            urunTanimlama();
        }
    }

    public static void urunRafaKoy() {

        if ((urunTanimlamaListesi.size() > 0)) {
            System.out.println("Lütfen, rafa koymak istediğiniz ürün ID numarasını giriniz.");
            try {
                int rafIcinUrunID = input.nextInt();
                input.nextLine();

                if (urunIDListesi.contains(rafIcinUrunID)) {
                    for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
                        if (rafIcinUrunID == w.getKey() && w.getValue().getMiktar() <= 0) {
                            System.err.println("Miktar girişi yapılmadan ürün rafa yerleştirilemez!");
                            return;
                        }
                    }
                    System.out.println("Ürünü koymak istediğiniz rafı yazınız.");
                    String raf = input.nextLine();

                    for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
                        if (rafIcinUrunID == w.getKey() && w.getValue().getMiktar() > 0) {
                            w.getValue().setRaf(raf);
                            System.out.println("Ürün rafa başarıyla yerleştirildi.");
                        }
                    }
                } else {
                    System.err.println("Girdiğiniz ID numarasına ait bir ürün bulunmamaktadır!");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.err.println("Hatalı giriş! Lütfen sayısal bir ürün ID numarası yazınız.");
                System.out.println();
                input.nextLine();
            }
        } else {
            System.err.println("Ürün listesi boş, Lütfen ürün ekleyin.");
            System.out.println();
        }
    }

    public static void urunCikis() {

        if ((urunTanimlamaListesi.size() > 0)) {
            System.out.println("Ürün çıkışı yapmak istediğiniz ürünün ID numarasını giriniz.");
            try {
                int id = input.nextInt();
                input.nextLine();

                if (urunIDListesi.contains(id)) {

                    for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
                        if (id == w.getKey() && w.getValue().getMiktar() <= 0) {
                            System.err.println("Girmiş olduğunuz ID ye ait ürün miktarı zaten 0 'dır, ilk önce ürün miktar girişi yapınız. ");
                            return;
                        }
                    }
                    System.out.println("Çıkış yapmak istediğiniz miktarı giriniz.");
                    try {
                        int cikisMiktari = input.nextInt();
                        input.nextLine();

                        if (cikisMiktari > 0) {

                            for (Map.Entry<Integer, Urun> w : urunTanimlamaListesi.entrySet()) {
                                if (id == w.getKey()) {
                                    if (w.getValue().getMiktar() < cikisMiktari) {
                                        System.err.println("Yeterli ürün stoğu bulunmamaktadır!");
                                    } else {
                                        w.getValue().setMiktar(w.getValue().getMiktar() - cikisMiktari);
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.err.println(" 0 veya negatif sayı girilemez");
                            urunCikis();
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Hatalı giriş! Lütfen sayısal bir miktar girişi yapınız.");
                        input.nextLine();
                    }
                } else {
                    System.err.println("Girdiğiniz ID numarası ait bir ürün bulunmamaktadır");
                }
            } catch (InputMismatchException e) {
                System.err.println("Hatalı giriş! Lütfen sayısal bir ürün ID numarası yazınız.");
                input.nextLine();
            }
        }else {
            System.err.println("Ürün listesi boş, Lütfen ürün ekleyin.");
            System.out.println();
        }
    }

    public static void urunSilme() {
        if ((urunTanimlamaListesi.size() > 0)) {
            System.out.println("Lütfen silmek istediğiniz ürünün ID numarasını giriniz.");
            try {
                int silmeID = input.nextInt();
                input.nextLine();

                if (urunIDListesi.contains(silmeID)) {
                    Iterator<Map.Entry<Integer, Urun>> liste = urunTanimlamaListesi.entrySet().iterator();

                    while (liste.hasNext()) {
                        Map.Entry<Integer, Urun> w = liste.next();
                        if (w.getKey() == silmeID) {
                            liste.remove();
                            urunIDListesi.remove(silmeID);
                            return;
                        }
                    }
                } else {
                    System.err.println("Girdiğiniz ID numarasına ait bir ürün bulunmamaktadır");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.err.println("Hatalı giriş! Lütfen sayısal bir ürün ID numarası giriniz.");
                input.nextLine();
            }
        } else {
            System.err.println("Ürün listesi boş, Lütfen ürün ekleyin.");
            System.out.println();
        }
    }


}
