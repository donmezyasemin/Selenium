package B171;
import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.model.ProductManager;
import warehouseoop.style.Utils;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class HomePage extends Location implements IDescriptionAndLocation {
    ProductManager productManager;

    public HomePage(ProductManager productManager) {
        super(productManager, "ANASAYFA");

    }

    public static void run(){
        System.out.println();
        ProductManager pm=new ProductManager();
        Utils.infoPage(pm.getName().toUpperCase());
        Utils.street();
        Utils.versionText(" Bu uygulama DEV 02 Takımı tarafından DEPO YÖNETİM SİSTEMİ v-1.0 olarak dizayn edilmiştir");
        Utils.menu();
        pm.listFill();
        getSelectionMenu(pm);


    }

    public static void getSelectionMenu(ProductManager ptm){



        String s=" ";
        boolean isFail=true;

        do {//döngü başlangıç
            try {
                System.out.println("\n");
                Utils.errTrow(" !!!! Menüden bir işlem seçiniz!!!! ");
                String select= null;
                try {
                    select = Utils.input.nextLine().toUpperCase();
                } catch (InputMismatchException e) {
                    System.out.println("Beklenen türde veri girilmedi");
                }
                switch (select) {
                    case "1":
                        Utils.cursorSetting(" Ürün Listeleme işlemini seçtiniz ");
                        new ShowProductList(ptm).onLocation();
                        isFail = false;
                        break;
                    case "2":
                        Utils.cursorSetting(" Ürün Tanımlama işlemini seçtiniz ");
                        new ProductDefinePage(ptm).onLocation();
                        isFail = false;
                        break;
                    case "3":
                        Utils.cursorSetting(" Ürün Rafa Koy işlemini seçtiniz ");
                        new PutOnSelfPage(ptm).onLocation();
                        isFail = false;
                        break;
                    case "4":
                        Utils.cursorSetting(" Ürün Çıkış Yap işlemini seçtiniz ");
                        new OutputProductPage(ptm).onLocation();
                        isFail = false;
                        break;
                    case "5":
                        Utils.cursorSetting(" Ürün Güncelleme işlemini seçtiniz ");
                        new ProductUpdatePage(ptm).onLocation();
                        isFail = false;
                        break;
                    case "6":
                        new ExitPage(ptm).onLocation();
                        isFail=false;
                        break;
                    default:
                        HomePage.run();
                        isFail = false;

                }
            }catch (InputMismatchException e){
                Utils.errTrow(Utils.ANSI_MAVI+"(◔_◔) (◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔)(◔_◔) ");
                System.out.println();
                Utils.errTrow(Utils.ANSI_KIRMIZI+"!!!! Geçersiz bir değer girdiniz. Lütfen Menüden seçim yapınız.!!!!");
                Utils.menu();
                isFail=false;

            } catch (NoSuchElementException e) {
                Utils.errTrow(Utils.ANSI_KIRMIZI+"!!!! Geçersiz bir değer girdiniz. Lütfen Menüden seçim yapınız.!!!!");
            }
        } while (!isFail) ;//döngü bitiş
    }


    public ProductManager getProductManager() {
        return productManager;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }


    @Override
    public boolean onLocation() {
        return false;
    }



    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+"\n"
                +s.repeat(31)+"Bu lokasyon,uygulamanın anasayfasıdır yapmak istedğiniz işlemle ilgili\n"
                +s.repeat(31)+"bir menu sunulur seçiminize göre lokasyona yönlendirilirsiniz\n";
        return str;
    }

    @Override
    public String pageDescription() {
        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ANASAYFA"+s.repeat(1)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
        return str;
    }
}
