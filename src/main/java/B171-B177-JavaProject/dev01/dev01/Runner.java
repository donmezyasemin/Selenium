package B171;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        MetotDepo metotDepo = new MetotDepo();
        Scanner input = new Scanner(System.in);
        System.out.println("Tanitimi izlemek icin 'Q' ya Gecmek icin Herhangi bir tusa basiniz");
      String  tanitim=input.nextLine();
        if (tanitim.equalsIgnoreCase("Q")){
            metotDepo.tanitim();
        }


         metotDepo.fakeUrun(); // test icin Fake urunler eklendi

        while (true) {
            System.out.println("========================== İŞLEMLER =======================");
            System.out.println("   ____________________              ____________________");
            System.out.println("   | 1-URUN TANIMLAMA       |       |  2-URUN GIRISI      |");
            System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("   | 3-URUN RAFA KOY        |       |  4-URUN CIKISI      |");
            System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("   | 5-URUN FILTRELE        |       |  6-URETICI FILTRELE |");
            System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("   | 7-RAFTAKI URUN LISTELE |       |  8-URUN GUNCELLE    |");
            System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("   | 9-TANIMLI URUN SIL     |       |  0-CIKIS            |");
            System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.print("ISLEM SECINIZ : ");
            String menuSecim = input.nextLine();

            if (metotDepo.listeKontrol() || menuSecim.equals("1")) {


                switch (menuSecim) {
                    case "1":
                        System.out.print("Urun cinsini giriniz: ");
                        String cinsi = input.nextLine();
                        System.out.print("Ureticisini giriniz: ");
                        String uretici = input.nextLine();
                        System.out.print("Birimini giriniz: ");
                        String birim = input.nextLine();
                        metotDepo.urunTanimlama(cinsi, uretici, birim);
                        metotDepo.tanimlananUrunListele();
                        break;
                    case "2":

                        boolean varmi;
                        String id;
                        do {
                            System.out.print("Eklemek istediğiniz urunun ID'sini giriniz: ");

                            id = input.nextLine();
                            varmi = metotDepo.idKontrol(id);

                        } while (!varmi);

                        System.out.print("Ne kadar eklemek istersiniz: ");

                        metotDepo.urunGirisi(id, input);
                        metotDepo.tanimlananUrunListele();
                        break;
                    case "3":

                        do {
                            System.out.print("Rafa Koymak istediğiniz urunun ID'sini giriniz: ");

                            id = input.nextLine();
                            varmi = metotDepo.idKontrol(id);

                        } while (!varmi);

                        metotDepo.urunuRafaKoy(id, input);
                        metotDepo.raftakiUrunleriListele();
                        break;
                    case "4":
                        do {
                            System.out.print("Cikarmak istediğiniz urunun ID'sini giriniz: ");

                            id = input.nextLine();
                            varmi = metotDepo.idKontrol(id);

                        } while (!varmi);
                        System.out.print("Kaç adet çıkarmak istersiniz: ");

                        metotDepo.urunCikisi(id, input);
                        metotDepo.tanimlananUrunListele();
                        break;
                    case "5":
                        System.out.print("Filtrelemek istediğiniz ürün cinsini giriniz: ");
                        String filterCinsi = input.nextLine();
                        metotDepo.urunFiltrele(filterCinsi);
                        break;
                    case "6":
                        System.out.print("Filtrelemek istediğiniz üreticiyi giriniz: ");
                        String filterUretici = input.nextLine();

                        metotDepo.ureticiFiltrele(filterUretici);
                        break;
                    case "7":
                        metotDepo.raftakiUrunleriListele();
                        break;
                    case "8":

                        do {
                            System.out.print("Güncellemek istediğiniz ürünün ID'sini giriniz: ");
                            id = input.nextLine();
                            varmi = metotDepo.idKontrol(id);
                        } while (!varmi);

                        metotDepo.urunGuncelleme(id, input);

                        break;
                    case "9":

                        do {
                            System.out.print("Silmek istediğiniz ürünün ID'sini giriniz: ");
                            id = input.nextLine();
                            varmi = metotDepo.idKontrol(id);

                        } while (!varmi);
                        metotDepo.urunSil(id);
                        metotDepo.tanimlananUrunListele();
                        break;
                    case "0":
                        System.out.println("HOSCAKALIN");
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız!");
                        break;
                }

            }else {
                System.out.println("Deponuzda Tanimli Urun Bulunmamaktadir Lutfen Urun tanimlayiniz..");
            }
        }

}
}
